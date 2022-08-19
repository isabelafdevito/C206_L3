import java.util.Scanner;
public class Time {

    Scanner leitor = new Scanner(System.in);
    String nome;
    String corCamisa;
    // associacao por agregacao:
    Jogador[] jogadores = new Jogador[30];
    //associacao por agregacao:
    Estadio e1;

    public void mostraInfo() {
        System.out.println("Informacoes do time: ");
        System.out.println("Nome do time: " + nome);
        System.out.println("Cor da camisa: " + corCamisa);
        System.out.println("---------");
        System.out.println("Informacoes do estadio: ");
        System.out.println("Nome do estadio: " + e1.nome);
        System.out.println("Capacidade: " + e1.capacidade);
        System.out.println("Cidade: " + e1.cidade);
    }

    public void adicionaJogador(Jogador jogador) {
        System.out.println("Escreva o nome do jogador: ");
        jogador.nome=leitor.nextLine();
        System.out.println("Coloque o salario do jogador: ");
        jogador.salario=leitor.nextDouble();
        System.out.println("Coloque o numero da camisa do jogador: ");
        jogador.nCamisa=leitor.nextInt();
        leitor.nextLine();
        System.out.println("O jogador veio da base?");
        jogador.base= leitor.nextBoolean();
        leitor.nextLine();
    }

    double totalSalario = 0;

    public double calculaTotalSalario() {
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null) {
                totalSalario += jogadores[i].salario;
            }
        }

        return totalSalario;
    }

    public void mostraJogadoresBase() {
        System.out.println("Informacoes dos jogadores que vieram da base: ");
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null) {
                if (jogadores[i].base) {
                    jogadores[i].mostraInfo();
                }
            }
        }


    }

}

