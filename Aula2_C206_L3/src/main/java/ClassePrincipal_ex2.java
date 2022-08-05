import java.util.Scanner;
public class ClassePrincipal_ex2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com um inteiro de 1 a 3: ");
        int num = leitor.nextInt();
        if (num == 1) {
            System.out.println("Pedra");
        }
        else if(num == 2) {
            System.out.println("Papel");
        }
        else if (num == 3) {
            System.out.println("Tesoura");
        }
        else {
            System.out.println("NULL");
        }
        leitor.close();
    }
}
