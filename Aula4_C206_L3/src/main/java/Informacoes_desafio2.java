public class Informacoes_desafio2 {

    public int numero;
    public String local;
    public double valorSorteio;
    public int[] numeroSorteado = new int[6];
    public int ganhadores;

    void mostraGanhador() {

        System.out.println("Informacoes do ganhador: ");
        System.out.println("Ganhador: " + ganhadores);
        System.out.println("Local: " + local);
        System.out.println("Numero: " +  numero);
        System.out.println("Valor ganho: " + valorSorteio + " reais");
        System.out.println("Numeros sorteados: ");
        for(int i=0;i<6;i++) {
            System.out.print(numeroSorteado[i] + " ");
        }

    }




}
