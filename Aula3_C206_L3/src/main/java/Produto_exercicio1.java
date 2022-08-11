public class Produto_exercicio1 {
    //atributos da classe:
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo() {
        System.out.println("Informacoes do produto: " + nome);
        System.out.println("Codigo de serie: " + codigoSerie);
        System.out.println("Codigo do produto: " + codigoProduto);
        System.out.println("Categoria: "+categoria);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
