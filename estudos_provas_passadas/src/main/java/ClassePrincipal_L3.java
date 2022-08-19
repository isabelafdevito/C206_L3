import java.util.Scanner;
public class ClassePrincipal_L3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Locadora locadora = new Locadora();
        Carro[] carro = new Carro[30];
        locadora.car=carro;

        locadora.nome="AlugaCars";
        locadora.CNPJ="1234.5678.9876-10";
        locadora.endereco="Rua Almirantes, 121";
        locadora.carrosParaAlugar=30;

        //criacao do menu:

        System.out.println("  MENU  ");
        System.out.println("Para adicionar um carro na locadora selecione: 1");
        System.out.println("Para mostrar as informacoes da locadora e dos carros selecione: 2");
        System.out.println("Para calcular a porcentagem de carros disponiveis selecione: 3");
        System.out.println("Para alugar um carro selecione: 4");
        System.out.println("Para sair do menu digite 5");
        System.out.println("Selecione uma nova opcao: ");

        int x = leitor.nextInt();
int t=0;
       while(x!=5) {

           if(x==1) {
               carro[t] = new Carro();
               locadora.adicionarCarro(locadora.car[t]);
               t++;
           }

           else if(x==2) {
               locadora.mostraInfo();
               for(int i=0;i<carro.length;i++) {
                   if(locadora.car[i]!=null) {
                       System.out.println("Informacoes do carro " + i+1 + " :");
                       locadora.car[i].mostraInfo();
                       locadora.car[i].m.mostraInfo();
                   }
               }
           }

           else if(x==3) {
               System.out.println("Porcentagem de carros para alugar: ");
               System.out.println(locadora.contarCarrosParaAlugar() + "%");
           }

           else if(x==4) {
               System.out.println("Selecione o index do carro que deseja alugar: ");
               int index = leitor.nextInt();
               locadora.alugarCarro(index-1);
           }

           else {
               System.out.println("Opcao invalida");
           }
            System.out.println("Selecione uma nova opcao: ");
           x = leitor.nextInt();


       }

        leitor.close();
}


}