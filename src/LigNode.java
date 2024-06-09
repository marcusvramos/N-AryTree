class LigNode {
    private No lig;
    private LigNode prox;

    public LigNode(No lig) {
        this.lig = lig;
        this.prox = null;
    }

    public LigNode() {}

    public void setFilho(No lig) {
        this.lig = lig;
    }

    public No getFilho() {
        return this.lig;
    }

    public LigNode getProx() {
        return this.prox;
    }

    public void setProx(LigNode prox) {
        this.prox = prox;
    }
}
