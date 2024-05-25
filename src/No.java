public class No {
    private int info;
    private No proxInfo;
    private No lig;
    private No prox;
    private int tl;

    public No(int info) {
        this.info = info;
        this.proxInfo = null;
        this.lig = null;
        this.prox = null;
        this.tl = 1;
    }

    public int getInfo() {
        return info;
    }

    public No getProxInfo() {
        return proxInfo;
    }

    public void setProxInfo(No proxInfo) {
        this.proxInfo = proxInfo;
    }

    public No getLig() {
        return lig;
    }

    public void setLig(No lig) {
        this.lig = lig;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public int getTl() {
        return tl;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }

    public void addInfo(int info) {
        No novo = new No(info);
        if (this.proxInfo == null) {
            this.proxInfo = novo;
        } else {
            No atual = this.proxInfo;
            while (atual.getProxInfo() != null) {
                atual = atual.getProxInfo();
            }
            atual.setProxInfo(novo);
        }
        this.tl++;
    }

    public void addLig(No no) {
        if (this.lig == null) {
            this.lig = no;
        } else {
            No atual = this.lig;
            while (atual.getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProx(no);
        }
    }
}