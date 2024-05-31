
public class AplicacaoNArea {
    private NArea arv;

    public AplicacaoNArea() {
        arv = new NArea();
    }

    public void executa() {
        for(int i = 1; i <= 25; i++) {
            arv.inserir(i);
        }

        System.out.println("Exibição em nível:");
        arv.exibirEmNivel();
        System.out.println("\nInOrdem recursivo:");
        arv.inOrdem();
        System.out.println("\nInOrdem iterativo:");
        arv.inOrdemIterativo();
    }

    public static void main(String[] args) {
        AplicacaoNArea app = new AplicacaoNArea();
        app.executa();
    }
}