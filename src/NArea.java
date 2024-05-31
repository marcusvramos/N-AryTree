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

        Fila fila = new Fila();
        fila.enqueue(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.dequeue();
            while (atual != null) {
                System.out.print(atual.getInfo() + " ");
                No ligacao = atual.getLig();
                while (ligacao != null) {
                    fila.enqueue(ligacao);
                    ligacao = ligacao.getProx();
                }
                atual = atual.getProxInfo();
            }
        }
        System.out.println();
    }

    public void inOrdem() {
        inOrdem(raiz);
        System.out.println();
    }

    private void inOrdem(No no) {
        if (no != null) {
            inOrdem(no.getLig());
            No atual = no;
            while (atual != null) {
                System.out.print(atual.getInfo() + " ");
                atual = atual.getProxInfo();
            }
            inOrdem(no.getProx());
        }
    }

    public void inOrdemIterativo() {
        if (raiz == null) return;

        Pilha p = new Pilha();
        p.init();
        No atual = raiz;

        while (atual != null || !p.isEmpty()) {
            while (atual != null) {
                p.push(atual);
                atual = atual.getLig();
            }

            atual = p.pop();
            if (atual != null) {
                No temp = atual;
                while (temp != null) {
                    System.out.print(temp.getInfo() + " ");
                    temp = temp.getProxInfo();
                }
                atual = atual.getProx();
            }
        }
        System.out.println();
    }

}