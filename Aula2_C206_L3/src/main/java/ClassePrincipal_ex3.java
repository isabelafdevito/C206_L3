import java.util.Scanner;

public class ClassePrincipal_ex3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String figura = leitor.nextLine();
        float a; // valor para a altura da figura
        float b; // valor para a base da figura
        float r; // valor para o raio da figura
        switch (figura) {
            case "quadrado":
                System.out.println("Insira o tamanho da base e da altura:");
                a = leitor.nextFloat();
                b = leitor.nextFloat();
                System.out.println("Area do quadrado: " + b*a);
            break;
            case "triangulo":
                System.out.println("Insira o tamanho da base e da altura:");
                a = leitor.nextFloat();
                b = leitor.nextFloat();
                System.out.println("Area do triangulo: " + (b*a)/2);
                break;
            case "circulo":
                System.out.println("Insira o tamanho do raio:");
                r=leitor.nextFloat();
                System.out.println("Area do circulo: " + Math.pow(r,2)*Math.PI);
                break;
        }
        leitor.close();
    }
}
