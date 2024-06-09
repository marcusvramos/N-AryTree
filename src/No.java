class No {
    InfoNode info;
    LigNode lig;
    int tl;

    public No() {
        this.info = null;
        this.lig = null;
        this.tl = 0;
    }

    public No(int info) {
        tl = 1;
        this.lig = new LigNode();
        this.lig.setProx(new LigNode());
        this.info = new InfoNode(info);
    }

    // Método para adicionar uma informação no nó
    public void addInfo(int pos, InfoNode info) {
        LigNode novo = new LigNode();
        if (pos == 0) {
            info.setProx(this.info);
            this.info = info;
            novo.setProx(this.lig);
            this.lig = novo;
        } else {
            InfoNode aux = this.info;
            LigNode auxLig = this.lig;
            for (int i = 0; i < pos-1; i++) {
                aux = aux.getProx();
                auxLig = auxLig.getProx();
            }
            novo.setProx(auxLig.getProx());
            auxLig.setProx(novo);
            info.setProx(aux.getProx());
            aux.setProx(info);
        }
        tl++;
    }

    // Método para adicionar uma ligação no nó
    public void inserirLig(int pos, No no){
        LigNode aux = this.lig;
        for(int i = 0; i < pos; i++){
            aux = aux.getProx();
        }
        aux.setFilho(no);
    }

    // Método para buscar a posição de inserção
    public int buscarPos(int info) {
        InfoNode atual = this.info;
        int pos = 0;
        while (atual != null && atual.getInfo() < info) {
            atual = atual.getProx();
            pos++;
        }
        return pos;
    }

    public LigNode getLig(int pos) {
        LigNode aux = this.lig;
        for (int i = 0; i < pos; i++) {
            aux = aux.getProx();
        }
        return aux;
    }
}
