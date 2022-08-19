import java.util.Scanner;
public class ClassePrincipal_L4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Time time = new Time();
        Estadio estadio = new Estadio();
        time.e1=estadio;

        time.nome="Sao Paulo";
        time.corCamisa="Vermelho e branco";
        estadio.nome="Mineirao";
        estadio.capacidade=20000;
        estadio.cidade="Sao Paulo - SP";

        //criacao do menu:

        System.out.println("  MENU  ");
        System.out.println("Para inserir um jogador selecione: 1");
        System.out.println("Para mostrar as informacoes do time, estadio e jogadores, selecione: 2");
        System.out.println("Para calcular o valor total dos salarios dos jogadores, selecione: 3");
        System.out.println("Para ver as informacoes dos jogadores que vieram da base do time, selecione: 4");
        System.out.println("Para sair do menu digite 5");
        System.out.println("Selecione uma nova opcao: ");

        int x = leitor.nextInt();
        leitor.nextLine();
        int t=0;
while(x!=5) {

        if(x==1) {
            time.jogadores[t] = new Jogador();
            time.adicionaJogador(time.jogadores[t]);
            t++;
        }
        else if(x==2) {
            time.mostraInfo();
            System.out.println();
            for (int i = 0; i < time.jogadores.length; i++) {
                if (time.jogadores[i] != null) {
                    time.jogadores[i].mostraInfo();
                }
            }
        }
        else if(x==3) {
            System.out.print("Total dos salarios dos jogadores: ");
            System.out.println(time.calculaTotalSalario() + " reais");
        }

        else if(x==4) {
            time.mostraJogadoresBase();
        }
        else {
            System.out.println("Opcao invalida");
        }

    System.out.println("Selecione uma nova opcao: ");
    x = leitor.nextInt();
    leitor.nextLine();

}

        leitor.close();
}

    }


