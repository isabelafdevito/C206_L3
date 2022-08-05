import java.util.Random;
public class ClassePrincipal_desafio {
    public static void main(String[] args) {

        Random gerador = new Random();
        int x = gerador.nextInt(100);
        int y = gerador.nextInt(100);
        int z = gerador.nextInt(100);


        if ((x % 2) == 0) {
            System.out.println("Numero " + x + " eh par");
        }
        else {
            System.out.println("Numero " + x + " eh impar");
        }

        if ((y % 2) == 0) {
            System.out.println("Numero " + y + " eh par");
        }
        else {
            System.out.println("Numero " + y + " eh impar");
        }

        if ((z % 2) == 0) {
            System.out.println("Numero " + z + " eh par");
        }
        else {
            System.out.println("Numero " + z + " eh impar");
        }
    }

}
