import java.util.Scanner;
public class ClassePrincipal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Faculdade faculdade = new Faculdade();
        Aluno[] aluno = new Aluno[10];

        faculdade.alunos=aluno;

        faculdade.nome="INATEL";
        faculdade.CNPJ=12345;

        faculdade.c1.nome="Engenharia de Software";
        faculdade.c1.sigla="GES";

        System.out.println(" MENU ");
        System.out.println("Para adicionar um aluno digite 1");
        System.out.println("Para mostrar as informacoes do curso, dos alunos e da faculdade, digite 2");
        System.out.println("Para mostrar quantos alunos estao no 5 periodo ou mais, digite 3");
        System.out.println("Para calcular a porcentagem de alunos aprovados digite 4");
        System.out.println("Para sair do menu, digite 0");
        System.out.println("Digite uma opcao:");
        int x = leitor.nextInt();
        int t=0;
        while(x!=0) {
            if(x==1) {
                faculdade.alunos[t]=new Aluno();
                faculdade.addAluno(faculdade.alunos[t]);
                t++;
            }
            else if(x==2) {
                faculdade.mostraInfo();
                System.out.println();
                faculdade.c1.mostraInfo();
                System.out.println();
                for(int i=0;i<faculdade.alunos.length;i++) {
                    if(faculdade.alunos[i]!=null) {
                        faculdade.alunos[i].mostraInfo();
                        System.out.println("-------");
                    }
                }
            }

            else if(x==3) {
                faculdade.alunoSuperiorP5();
                System.out.println();
            }

            else if(x==4) {
                System.out.println("Porcentagem dos alunos aprovados: " + faculdade.mediaAprovacao() + " %");
                System.out.println();
            }

            else {
                System.out.println("Opcao invalida");
            }
            System.out.println(" MENU ");
            System.out.println("Para adicionar um aluno digite 1");
            System.out.println("Para mostrar as informacoes do curso, dos alunos e da faculdade, digite 2");
            System.out.println("Para mostrar quantos alunos estao no 5 periodo ou mais, digite 3");
            System.out.println("Para calcular a porcentagem de alunos aprovados digite 4");
            System.out.println("Para sair do menu, digite 0");
            System.out.println("Digite uma opcao:");
            x = leitor.nextInt();


        }
leitor.close();
    }

}
