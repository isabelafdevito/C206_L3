import java.util.Scanner;
public class Locadora {
    Scanner leitor = new Scanner(System.in);
    String nome;
    String CNPJ;
    String endereco;
    int carrosParaAlugar;

    //associacao por agregacao:
    Carro[] car;

    public void mostraInfo() {
        System.out.println("Informacoes da locadora: ");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("Endereco: " + endereco);
        System.out.println("Quantidade de carros para alugar: " + carrosParaAlugar);
        System.out.println("-----------");

    }

    public void adicionarCarro(Carro c1) {
        System.out.println("Insira o modelo do carro: ");
        c1.modelo=leitor.nextLine();
        System.out.println("Insira a cor do carro: ");
        c1.cor=leitor.nextLine();
        System.out.println("Insira a velocidade maxima que o motor alcanca: ");
        c1.m.velocidadeMaxima=leitor.nextFloat();
        leitor.nextLine();
    }

    public void alugarCarro (int index) {
        car[index].alugado=true;
    }
int alugados;
    public float contarCarrosParaAlugar() {
        for(int i=0;i<car.length;i++) {
            if(car[i]!=null) {
                if(car[i].alugado) {
                    alugados++;
                }
            }
        }
        float total = carrosParaAlugar-alugados;
        return ((total/carrosParaAlugar)*100);
    }


}
