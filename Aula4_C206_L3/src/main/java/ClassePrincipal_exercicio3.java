public class ClassePrincipal_exercicio3 {

    public static void main(String[] args) {
        Restaurante_exercicio3 restaurante = new Restaurante_exercicio3();
        Fornecedor_exercicio3[] fornecedor = new Fornecedor_exercicio3[100];
        restaurante.fornecedor=fornecedor;
        restaurante.nome="Dona Eliza";
        restaurante.cnpj="1234.5678.1234-210";
        restaurante.endereco="Rua Caxias, 121";
        fornecedor[0] = new Fornecedor_exercicio3("Bebidas", 400);
        fornecedor[1] = new Fornecedor_exercicio3("Comidas", 300);
        fornecedor[2] = new Fornecedor_exercicio3("Talheres", 200);


        restaurante.exibirInfos();

    }

}
