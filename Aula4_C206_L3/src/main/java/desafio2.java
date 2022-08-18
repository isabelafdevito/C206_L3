import java.util.Random;
public class desafio2 {
    public static void main(String[] args) {

        Informacoes_desafio2[] informacoes = new Informacoes_desafio2[105];

        int[] sorteio = new int[6];
        for (int i = 0; i < 105; i++) {
            informacoes[i] = new Informacoes_desafio2();
        }
        Random gerador = new Random();

        for (int i = 0; i < 105; i++) {
            informacoes[i].numero = i;
        }

        for(int i=0;i<105;i++) {
            informacoes[i].valorSorteio = 1000.0 + gerador.nextDouble(9000.0);
        }

        for(int i=0;i<105;i++) {
            for(int j=0;j<6;j++) {
                informacoes[i].numeroSorteado[j] = gerador.nextInt(60);
            }
        }

        for(int i=0;i<105;i++) {
            informacoes[i].local="Rua caxias, 151";
        }

        for(int i=0;i<105;i++) {
            informacoes[i].ganhadores = i;
        }

        for(int i=0;i<6;i++) {
            sorteio[i] = gerador.nextInt(60);
        }

        int[] ganhar = new int[105];
        for(int i=0;i<105;i++) {
            for(int j=0;j<6;j++) {
                if(informacoes[i].numeroSorteado[j] == sorteio[j]) {
                    ganhar[i]++;
                }
            }
        }

        for(int i=0;i<105;i++) {
            if(ganhar[i]==6) {
                informacoes[i].mostraGanhador();
            }
        }

    }
}
