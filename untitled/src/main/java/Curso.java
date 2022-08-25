public class Curso {

    String nome;
    String sigla;

    public void alunoMatriculado() {
        System.out.println("Aluno matriculado no curso!");
    }

    public void mostraInfo() {
        System.out.println("Informacoes do curso: ");
        System.out.println("Nome: " + nome);
        System.out.println("Sigla: " + sigla);
    }

}
