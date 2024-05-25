
public class AplicacaoNArea {
    private NArea arv;

    public AplicacaoNArea() {
        arv = new NArea();
    }

    public void executa() {
        arv.inserir(10);
        arv.inserir(20);
        arv.inserir(30);
        arv.inserir(40);
        arv.inserir(50);

        System.out.println("Exibição em nível:");
        arv.exibirEmNivel();
        System.out.println("\nExibição em profundidade:");
        arv.exibirEmProfundidade();
    }

    public static void main(String[] args) {
        AplicacaoNArea app = new AplicacaoNArea();
        app.executa();
    }
}