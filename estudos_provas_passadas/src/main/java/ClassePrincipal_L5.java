import java.util.Scanner;
public class ClassePrincipal_L5 {

    public static void main(String[] args) {

        Deck deck = new Deck();
        Carta[] carta = new Carta[10];
        deck.carta=carta;

        Scanner leitor = new Scanner(System.in);

        deck.dono="Bernardo";

        System.out.println("  MENU  ");
        System.out.println("Para adicionar uma carta selecione: 1");
        System.out.println("Para mostrar as informacoes do deck e das cartas, selecione: 2");
        System.out.println("Para calcular o poder total do deck e sua media aritmetica, selecione: 3");
        System.out.println("Para ver quantos soldados, arqueiros e pesados tem no deck, selecione: 4");
        System.out.println("Para sair do menu digite 5");
        System.out.println("Selecione uma nova opcao: ");

        int x=leitor.nextInt();
        leitor.nextLine();
int t=0;
        while(x!=5) {
            if(x==1) {
                carta[t]=new Carta();
                deck.adicionarCarta(deck.carta[t]);
                t++;
            }
            else if(x==2) {
                deck.mostraInfo();
                }
            else if(x==3) {
                deck.calculaPoderMedio();
            }
            else if(x==4) {
                deck.calculaClassificacao();
            }
            else {
                System.out.println("Opcao invalida");
            }

            System.out.println("Selecione uma nova opcao: ");

            x=leitor.nextInt();
            leitor.nextLine();
            }

        leitor.close();
        }

    }

