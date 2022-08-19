import java.util.Objects;
import java.util.Scanner;
public class Deck {

    Scanner leitor = new Scanner(System.in);
    String dono;
    Carta[] carta;

    public void adicionarCarta(Carta c1) {
        System.out.println("Coloque o nome da carta: ");
        c1.nome=leitor.nextLine();
        System.out.println("Entre com o poder da carta: ");
        c1.poder=leitor.nextInt();
        leitor.nextLine();
        System.out.println("Entre com a classificacao da carta (soldado, arqueiro ou pesado): ");
        c1.classificacao=leitor.nextLine();

    }

    public void mostraInfo() {
        System.out.println("Informacoes do deck: ");
        System.out.println("Dono do deck: " + dono);
        System.out.println("----------");
        System.out.println("Informacoes das cartas: ");
        for(int i=0;i<carta.length;i++) {
            if(carta[i]!=null) {
                System.out.println("Nome da carta: " + carta[i].nome);
                System.out.println("Poder da carta: " + carta[i].poder);
                System.out.println("Classificacao da carta: " + carta[i].classificacao);
            }
        }
        System.out.println("----------");
    }

    double poderTotal=0;
    double poderMedio=0;
    double nCartas=0;
    public void calculaPoderMedio() {
        for(int i=0;i< carta.length;i++) {
            if(carta[i]!=null) {
                poderTotal += carta[i].poder;
                nCartas++;
            }

        }

        System.out.println("Poder total do deck: " + poderTotal);
        poderMedio=poderTotal/nCartas;
        poderMedio= (Math.round(poderMedio*100.0)/100.0);
        System.out.println("Media aritmetica do deck: " + poderMedio);
        System.out.println("----------");
    }
int soldados=0;
    int arqueiros=0;
    int pesados=0;
    public void calculaClassificacao() {
        for(int i=0;i<carta.length;i++) {
            if(carta[i]!=null) {
                if(Objects.equals(carta[i].classificacao, "soldado")) {
                    soldados++;
                }
                else if(Objects.equals(carta[i].classificacao, "arqueiro")) {
                    arqueiros++;
                }
                else if(Objects.equals(carta[i].classificacao, "pesado")) {
                    pesados++;
                }
             }
        }

        System.out.println("Quantidade de cartas soldados: " + soldados);
        System.out.println("Quantidade de cartas arqueiros: " + arqueiros);
        System.out.println("Quantidade de cartas pesados: " + pesados);

        System.out.println("----------");
    }

}
