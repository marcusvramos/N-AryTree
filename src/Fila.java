public class Fila {
    private NoFila inicio;
    private NoFila fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public void enqueue(No no) {
        NoFila novo = new NoFila(no);
        if (this.inicio == null) {
            this.inicio = this.fim = novo;
            return;
        }

        this.fim.setProx(novo);
        this.fim = novo;
    }

    public No dequeue() {
        if (this.inicio == null) {
            return null;
        }

        No no = this.inicio.getNo();
        this.inicio = this.inicio.getProx();
        return no;
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }
}
