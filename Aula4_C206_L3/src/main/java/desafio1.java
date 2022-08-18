import java.util.Arrays;
public class desafio1 {
    public static void main(String[] args) {

    String[] ordenar = new String[5];
    ordenar[0]="Isabela";
    ordenar[1]="Bernardo";
    ordenar[2]="Bruno";
    ordenar[3]="Luciene";
    ordenar[4]="Isabella";

    System.out.println("Arrays antes de ordenar:");
    for(int i=0;i< ordenar.length;i++) {
        if(ordenar[i]!=null) {
            System.out.println(ordenar[i]);
        }
    }

        System.out.println("----------");

        System.out.println("Arrays depois de ordenar:");

    Arrays.sort(ordenar);

    for(int i=0;i< ordenar.length;i++) {
        if(ordenar[i]!=null) {
            System.out.println(ordenar[i]);
        }
    }
}
}
