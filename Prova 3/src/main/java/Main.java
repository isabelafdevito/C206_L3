import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arquivo arq = new Arquivo();
        Compra c = new Compra();
        boolean flag = true;

        ArrayList<Compra> compras = new ArrayList<>();


        while (flag) {
            System.out.println("Digite sua opção: ");
            System.out.println("1 - Cadastrar um novo animal");
            System.out.println("2 - Ler Informacoes");
            System.out.println("3 - Ordenar por ordem alfabetica");
            System.out.println("4 - Ordenar por peso");
            System.out.println("5 - Calcular o valor medio dos lucros");
            System.out.println("6 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                try {
                    try {
                        System.out.println("Digite o ID do gado: ");
                        c.setId(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Digite a raca: ");
                        c.setRaca(sc.nextLine());
                        System.out.println("Digite o peso: ");
                        c.setPeso(sc.nextInt());
                        System.out.println("Digite o preco de venda: ");
                        c.setPrecoVenda(sc.nextFloat());

                        if (c.getPrecoVenda() < 2 * c.getPeso()) {
                            throw new PrejuizoException();
                        } else {
                            arq.anotar(c);
                            compras.add(c);
                            System.out.println("Gado adicionado!");
                        }
                    } catch (PrejuizoException p) {
                        System.out.println(p + " Preco de venda do gado menor que o dobro do peso");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;


             case 2:
                ArrayList<Compra> ler = arq.ler();
                for (int i = 0; i < ler.size(); i++) {
                    System.out.println("ID do gado: " + ler.get(i).getId());
                    System.out.println("raca do gado: " + ler.get(i).getRaca());
                    System.out.println("Peso do gado: " + ler.get(i).getPeso());
                    System.out.println("Preco de venda do gado: " + ler.get(i).getPrecoVenda());
                }
                break;

                case 3:
                    Compra[] p = new Compra[compras.size()];
                    for (int i = 0; i < compras.size(); i++) {
                        p[i] = compras.get(i);
                    }
                    c.compare(p);
                    System.out.println("Ordenacao por raca: ");
                    for(int j = 0;j<p.length;j++) {
                        System.out.println(p[j].getId());
                        System.out.println(p[j].getRaca());
                        System.out.println(p[j].getPeso());
                        System.out.println(p[j].getPrecoVenda());
                    }
                break;


                case 4:
                ArrayList<Compra> pesos = arq.ler();
                Collections.sort(pesos);
                System.out.println("Ordenacao por peso: ");
                for(Compra c1 : pesos) {
                    System.out.println(c1.getPeso());
                }
                break;

                case 5:

                ArrayList<Compra> comp = arq.ler();
                int lucros = 0;
                int lucros_aux = 0;
                for (int i = 0; i < comp.size(); i++) {
                    lucros += comp.get(i).getPrecoVenda();
                    lucros_aux++;
                }
                System.out.println("Valor medio dos lucros: " + lucros / lucros_aux);

            break;
            case 6:
                flag = false;
                System.out.println("Você saiu!");
                break;
            default:
                System.out.println("opção inválida!");

            }


        }

    }
}
