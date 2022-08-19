import java.util.Scanner;
public class Plataforma {
Scanner leitor = new Scanner(System.in);
    String nome;
    String criador;
    //associacao por composicao:
    Jogo[] jogos = new Jogo[10];

    public void mostraInfo() {
        System.out.println("Nome da plataforma: " + nome);
        System.out.println("Criador: " + criador);
    }

    public void adicionarJogo(Jogo jogo) {
        System.out.println("Entre com o nome do jogo: ");
        jogo.nome=leitor.nextLine();
        System.out.println("Entre com o genero do jogo: ");
        jogo.genero=leitor.nextLine();
        System.out.println("Entre com o preco do jogo: ");
        jogo.preco=leitor.nextFloat();
        jogo.preco= (Math.round(jogo.preco*100.0)/100.0);
        leitor.nextLine();
        System.out.println("O jogo tem dlc?");
        jogo.dlc=leitor.nextBoolean();
        leitor.nextLine();
    }
double menor=200;
int menor_aux;
double maior=0;
int maior_aux;
    public void mostrarMaisCaroBarato() {
        for(int i=0;i<jogos.length;i++) {
            if(jogos[i]!=null) {
                if(jogos[i].preco>maior) {
                    maior = jogos[i].preco;
                    maior_aux=i;
                }
                if(jogos[i].preco<menor) {
                    menor=jogos[i].preco;
                    menor_aux=i;
                }
            }
        }

        System.out.println("Jogo mais barato eh o: " + jogos[menor_aux].nome +" que custa: " + menor);
        System.out.println("Jogo mais caro eh o: " + jogos[maior_aux].nome +" que custa: " + maior);
    }
    int totalDLC;
    public void calculaDLC() {
        for(int i=0;i< jogos.length;i++) {
            if(jogos[i]!=null) {
                if(jogos[i].dlc) {
                    totalDLC++;
                }
            }
        }

        System.out.println("Total de jogos que possuem DLC: " + totalDLC);
    }

}
