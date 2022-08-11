public class Carro {

    String cor;
    String marca;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;

    Motor motor;

    void ligar() {
        System.out.println("O carro da marca " + marca + " modelo " + modelo + " e cor " + cor + " ligou");
    }

    void acelerar() {
        System.out.println("O carro da marca " + marca + " modelo " + modelo + " e cor " + cor + " acelerou");
    }
    void mostraInfo() {
        System.out.println("Informacoes do carro: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade maxima que o carro pode atingir: " + velocidadeMaxima);
        System.out.println("Velocidade atual do carro: " + velocidadeAtual);
    }

    public Carro() {
        motor = new Motor();
    }

}
