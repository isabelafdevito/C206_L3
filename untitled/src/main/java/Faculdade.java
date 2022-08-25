import java.util.Scanner;
public class Faculdade {
Scanner leitor = new Scanner(System.in);
    String nome;
    int CNPJ;
    Aluno[] alunos;

    Curso c1 = new Curso();

    //metodo para adicionar alunos:
    public void addAluno(Aluno aluno) {
        System.out.println("Insira o nome do aluno: ");
        aluno.nome=leitor.nextLine();
        System.out.println("Insira a idade do aluno: ");
        aluno.idade=leitor.nextInt();
        leitor.nextLine();
        System.out.println("Insira a matricula do aluno: ");
        aluno.matricula=leitor.nextLine();
        System.out.println("Insira o periodo do aluno: ");
        aluno.periodo=leitor.nextInt();
        System.out.println("Caso o aluno esteja aprovado, escreva 'true'. Se o aluno estiver reprovado, escreva 'false'");
        aluno.aprovado=leitor.nextBoolean();
        leitor.nextLine();
    }

    //metodo para mostrar quandos alunos estao aprovados:
    float totalAlunos;
    float aprovados;

    public float mediaAprovacao() {
        totalAlunos=0;
        aprovados=0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                totalAlunos++;
                if (alunos[i].aprovado) {
                    aprovados++;
                }
            }
        }

        return (aprovados/totalAlunos)*100;

    }
    int superior;
    //metodo para mostrar quantos alunos estao na P5 ou superior:
    public void alunoSuperiorP5() {
        superior=0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                if(alunos[i].periodo>=5) {
                    superior++;
                }
            }
        }
        System.out.println("A quantidade de alunos que estao na P5 ou superior sao: " + superior + " alunos");
    }

    //mostrando as informacoes da faculdade:
    public void mostraInfo() {
        System.out.println("Informacoes da faculdade: ");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + CNPJ);
    }

}
