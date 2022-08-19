public class Jogador {

    String nome;
    double salario;
    int nCamisa;
    boolean base;

    public void mostraInfo() {
        System.out.println("Informacoes do jogador: ");
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Numero da camisa: " + nCamisa);
        if(base) {
            System.out.println("Veio da base do time");
        }
        else {
            System.out.println("Nao veio da base do time");
        }
        System.out.println("---------");
    }

}
