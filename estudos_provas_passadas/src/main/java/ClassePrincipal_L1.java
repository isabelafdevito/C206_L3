import java.util.Scanner;
public class ClassePrincipal_L1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Plataforma p = new Plataforma();
        p.nome="FunGames";
        p.criador="Steven Fox";

        System.out.println("  MENU  ");
        System.out.println("Para adicionar um jogo na plataforma selecione: 1");
        System.out.println("Para mostrar as informacoes da plataforma e dos jogos selecione: 2");
        System.out.println("Para ver quais sao os jogos mais caro e mais barato selecione: 3");
        System.out.println("Para ver quantos jogos possuem dlc: 4");
        System.out.println("Para sair do menu digite 5");
        System.out.println("Selecione uma nova opcao: ");

        int x = leitor.nextInt();
int t=0;
        while(x!=5) {

            if(x==1) {
                p.jogos[t]=new Jogo();
                p.adicionarJogo(p.jogos[t]);
                t++;
            }
            else if(x==2) {
                System.out.println("Informacoes da plataforma: ");
                p.mostraInfo();
                for(int i=0;i<p.jogos.length;i++) {
                    if(p.jogos[i]!=null) {
                        System.out.println("Informacoes do jogo " + i+1  +" :");
                        p.jogos[i].mostraInfo();
                    }
                }
            }

            else if(x==3) {
                p.mostrarMaisCaroBarato();
            }
            else if(x==4) {
                p.calculaDLC();
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
