import java.util.Scanner;
public class ClassePrincipal_ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = 1;
        while(x!=7) {
            x=leitor.nextInt();
            if(x<0) {
                System.out.println("Esse numero nao eh aceito");
            }
            else if(x>10) {
                System.out.println("Esse numero nao eh aceito");
            }
            else
                System.out.println("Numero correto");
        }
        System.out.println("Numero incorreto");
        leitor.close();
    }

}
