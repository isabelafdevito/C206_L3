public class Empresa_exercicio2 {
    // associacao por agregação:


    Contato_exercicio2[] contact;

    public String cnpj;
    public String endereco;


        public void exibirInfos() {
            System.out.println("Informacoes da empresa: ");
            System.out.println("CNPJ da empresa: " + cnpj);
            System.out.println("Endereco da empresa: " + endereco);
            System.out.println("---------");
            System.out.println("Informacoes dos contatos da empresa: ");
            for (int i = 0; i < contact.length; i++) {
                if (contact[i] != null) {
                    System.out.println("Nome: " + contact[i].nome);
                    System.out.println("Email: " + contact[i].email);
                    System.out.println("Telefone: " + contact[i].telefone);
                    System.out.println("Data de nascimento: " + contact[i].dataNascimento);
                    System.out.println("------------");
                }
            }

        }


    }


