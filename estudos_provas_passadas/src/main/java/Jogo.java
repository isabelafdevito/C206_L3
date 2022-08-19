public class Jogo {

    String nome;
    String genero;
    double preco;
    boolean dlc;

    public void mostraInfo() {
        System.out.println("Nome do jogo: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Preco: " + preco + " reais");
        if(dlc) {
            System.out.println("Possui dlc");
        }
        else {
            System.out.println("Nao possui dlc");
        }
        System.out.println("---------");
    }

}
