public class NArea {
    private No raiz;

    public NArea() {
        raiz = null;
    }

    // Método para inserir um elemento na árvore
    public void inserir(int info) {
        if (raiz == null) {
            raiz = new No(info);
        } else {
            No folha = navegarAteFolha(info);

            if (folha.tl < 3-1) { // N = 3
                folha.addInfo(folha.buscarPos(info), new InfoNode(info));
            }  else{
                folha.inserirLig(folha.buscarPos(info), new No(info));
            }
        }
    }

    private No navegarAteFolha(int info){
        No aux = raiz;
        int pos = aux.buscarPos(info);
        while (aux.getLig(pos).getFilho() != null){
            aux = aux.getLig(pos).getFilho();
            pos = aux.buscarPos(info);
        }
        return aux;
    }

    // Método para exibir todos os elementos em nível
    public void exibirEmNivel() {
        if (raiz == null) return;

        Fila fila = new Fila();
        fila.enqueue(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.dequeue();
            if (atual == null) continue; // Verificação adicional

            InfoNode infoAtual = atual.info;
            while (infoAtual != null) {
                System.out.print(infoAtual.getInfo() + " ");
                infoAtual = infoAtual.getProx();
            }

            LigNode ligAtual = atual.lig;
            while (ligAtual != null) {
                if (ligAtual.getFilho() != null) {
                    fila.enqueue(ligAtual.getFilho());
                }
                ligAtual = ligAtual.getProx();
            }
        }
        System.out.println();
    }
}
