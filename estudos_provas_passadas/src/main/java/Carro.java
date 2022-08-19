public class Carro {

    String modelo;
    String cor;
    boolean alugado;

    //associacao por composicao:
    Motor m = new Motor();

    public void mostraInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        if(alugado) {
            System.out.println("Carro ja esta alugado!");
        }
        else {
            System.out.println("Carro disponivel para alugar!");
        }
    }

}
