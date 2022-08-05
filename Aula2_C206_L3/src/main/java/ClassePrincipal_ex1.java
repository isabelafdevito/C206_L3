import java.util.Scanner;
public class ClassePrincipal_ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x;
        System.out.println("Entre com um numero de 0 a 10: ");
        x=leitor.nextInt();
        while(x!=7) {
            if(x<0) {
                System.out.println("Esse numero nao eh aceito");
            }
            else if(x>10) {
                System.out.println("Esse numero nao eh aceito");
            }
            else
                System.out.println("Numero correto");
            System.out.println("Entre com um numero de 0 a 10: ");
            x=leitor.nextInt();
        }
        leitor.close();
    }

}
