import java.util.Random;
public class ClassePrincipal_desafio {
    public static void main(String[] args) {

        Random gerador1 = new Random();
        Random gerador2 = new Random();
        Random gerador3 = new Random();

        if ((gerador1.nextInt(100) % 2) == 0) {
            System.out.println("Numero 1 eh par");
        }
        else {
            System.out.println("Numero 1 eh impar");
        }

        if ((gerador2.nextInt(100) % 2) == 0) {
            System.out.println("Numero 1 eh par");
        }
        else {
            System.out.println("Numero 1 eh impar");
        }

        if ((gerador3.nextInt(100) % 2) == 0) {
            System.out.println("Numero 1 eh par");
        }
        else {
            System.out.println("Numero 1 eh impar");
        }
    }

}
