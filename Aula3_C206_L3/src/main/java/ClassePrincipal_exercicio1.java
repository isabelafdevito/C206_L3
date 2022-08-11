public class ClassePrincipal_exercicio1 {
    public static void main(String[] args) {
        Produto_exercicio1 produto1 = new Produto_exercicio1();
        produto1.nome="Iphone 12";
        produto1.codigoProduto="123456";
        produto1.codigoSerie=9876;
        produto1.categoria="Eletronicos";
        produto1.quantidade=10;

        Produto_exercicio1 produto2 = new Produto_exercicio1();
        produto2.nome="Geladeira";
        produto2.codigoProduto="1010101";
        produto2.codigoSerie=12345;
        produto2.categoria="Eletrodomesticos";
        produto2.quantidade=25;

        produto1.mostraInfo();
        produto2.mostraInfo();


    }
}
