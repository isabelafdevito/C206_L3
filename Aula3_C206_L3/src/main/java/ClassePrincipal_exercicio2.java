public class ClassePrincipal_exercicio2 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.cor="Azul";
        carro1.marca="BMW";
        carro1.modelo="M3";
        carro1.motor.tipo="V8";
        carro1.motor.potencia=400;
        carro1.velocidadeMaxima=240;
        carro1.velocidadeAtual=140;

        carro1.mostraInfo();
        carro1.ligar();
        carro1.acelerar();

        carro2.cor="Vermelho";
        carro2.marca="Ford";
        carro2.modelo="K";
        carro2.motor.tipo="v9";
        carro2.motor.potencia=360;
        carro2.velocidadeMaxima=280;
        carro2.velocidadeAtual=160;


        carro2.mostraInfo();
        carro2.ligar();
        carro2.acelerar();
    }
}
