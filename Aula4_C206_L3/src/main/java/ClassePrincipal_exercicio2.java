public class ClassePrincipal_exercicio2 {

    public static void main(String[] args) {
        Empresa_exercicio2 empresa = new Empresa_exercicio2();
        Contato_exercicio2[] contato = new Contato_exercicio2[100];
        empresa.cnpj="1234.5678.1234.67-10";
        empresa.endereco="Rua cobra, 155";
        empresa.contact=contato;
        contato[0] = new Contato_exercicio2("Isabela", "isabela.ferreira@ges.inatel.br", "35123456789", "27/09/02");
        contato[1] = new Contato_exercicio2("Bernardo", "bernardo.campos@ges.inatel.br", "35987654321", "17/12/02");
        contato[2] = new Contato_exercicio2("Leronardo", "leonardo.galisse@gec.inatel.br", "35666666666", "13/06/02");

        empresa.exibirInfos();


    }

}
