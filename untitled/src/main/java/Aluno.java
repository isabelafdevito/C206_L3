public class Aluno {

    String nome;
    int idade;
    String matricula;
    int periodo;
    boolean aprovado;

    public void mostraInfo() {
        System.out.println("Informacoes do aluno: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
        System.out.println("Periodo: " + periodo);
        if(aprovado) {
            System.out.println("O aluno esta aprovado");
        } else {
            System.out.println("O aluno esta reprovado");
        }

    }

}
