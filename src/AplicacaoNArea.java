public class AplicacaoNArea {
    public static void main(String[] args) {
        NArea nArea = new NArea();
        nArea.inserir(30);
        nArea.inserir(40);
        nArea.inserir(10);
        nArea.inserir(20);
        nArea.inserir(35);
        nArea.inserir(38);
        nArea.inserir(45);

        System.out.println("Exibição em nível:");
        nArea.exibirEmNivel();
    }
}