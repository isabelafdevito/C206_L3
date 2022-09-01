public class Calculadora {

    public final static double PI = 3.14;

    public static double circunferencia(double raio) {
        return PI*Math.pow(raio,2);
    }

    public static double volume (double raio) {
        return (4/3f)*PI*Math.pow(raio,3);
    }

}
