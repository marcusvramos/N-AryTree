class InfoNode {
    private int info;
    private InfoNode prox;

    public InfoNode(int info) {
        this.info = info;
        this.prox = null;
    }

    public int getInfo() {
        return info;
    }

    public InfoNode getProx() {
        return prox;
    }

    public void setProx(InfoNode prox) {
        this.prox = prox;
    }

    public void setInfo(int info) {
        this.info = info;
    }
}
