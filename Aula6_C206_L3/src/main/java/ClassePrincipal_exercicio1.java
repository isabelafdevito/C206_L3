import java.util.Scanner;
import java.text.DecimalFormat;
public class ClassePrincipal_exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double r;
        System.out.println("Insira o tamanho do raio da esfera: ");
        r= leitor.nextDouble();

        System.out.println("Valor de pi: " + Calculadora.PI);
        System.out.println("Tamanho da circunferencia: " + Calculadora.circunferencia(r));

        System.out.println("Volume da esfera: " + deci.format((Calculadora.volume(r))));

        leitor.close();


    }

}
