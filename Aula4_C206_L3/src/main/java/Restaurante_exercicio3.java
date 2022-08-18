public class Restaurante_exercicio3 {
    //associacao por agregacao:
    Fornecedor_exercicio3[] fornecedor;

    public String cnpj;
    public String endereco;
    public String nome;

    //metodo para exibir informações dos fornecedores:
    public void exibirInfos() {
        System.out.println("Informacoes do restaurante: ");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("-----------");
        System.out.println("Informacoes dos fornecedores: ");
        for(int i=0;i< fornecedor.length;i++) {
            if(fornecedor[i] != null) {
                System.out.println("Tipo: " + fornecedor[i].tipo);
                System.out.println("Quantidade: " + fornecedor[i].quantidade);
                System.out.println("-----------");
            }
        }
    }

}
