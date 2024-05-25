import java.util.ArrayList;
import java.util.List;

public class NArea {
    private No raiz;

    public NArea() {
        this.raiz = null;
    }

    public void inserir(int info) {
        if (raiz == null) {
            raiz = new No(info);
            return;
        }

        No aux = raiz;
        boolean inseriu = false;

        while (!inseriu) {
            if (aux.getTl() < 3) {
                aux.addInfo(info);
                inseriu = true;
            } else {
                No ligacao = aux.getLig();
                boolean encontrou = false;
                while (ligacao != null && !encontrou) {
                    if (ligacao.getTl() < 3) {
                        aux = ligacao;
                        encontrou = true;
                    } else {
                        ligacao = ligacao.getProx();
                    }
                }
                if (!encontrou) {
                    No novoNo = new No(info);
                    aux.addLig(novoNo);
                    inseriu = true;
                }
            }
        }
    }

    public void exibirEmNivel() {
        if (raiz == null) return;

        List<No> fila = new ArrayList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No no = fila.remove(0);
            No atual = no;
            while (atual != null) {
                System.out.print(atual.getInfo() + " ");
                if (atual.getLig() != null) {
                    fila.add(atual.getLig());
                }
                atual = atual.getProxInfo();
            }
        }
    }

    public void exibirEmProfundidade() {
        if (raiz == null) return;

        List<No> pilha = new ArrayList<>();
        pilha.add(raiz);

        while (!pilha.isEmpty()) {
            No no = pilha.remove(pilha.size() - 1);
            No atual = no;
            while (atual != null) {
                System.out.print(atual.getInfo() + " ");
                if (atual.getLig() != null) {
                    pilha.add(atual.getLig());
                }
                atual = atual.getProxInfo();
            }
        }
    }
}