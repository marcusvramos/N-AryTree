public class NoFila {
    private No no;
    private NoFila prox;

    public NoFila(No no) {
        this.no = no;
        this.prox = null;
    }

    public No getNo() {
        return no;
    }

    public NoFila getProx() {
        return prox;
    }

    public void setProx(NoFila prox) {
        this.prox = prox;
    }

    public void setNo(No no) {
        this.no = no;
    }
}
