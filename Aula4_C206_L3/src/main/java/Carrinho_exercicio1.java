public class Carrinho_exercicio1 {
//criando ponteiro para o produto:
    Produto_exercicio1[] product = new Produto_exercicio1[100];

    //colocando public a fins de costume
    // quando a gente for ver private/protected eu uso cada uma como deveria ser
    public double total=0; // valor total da compra

    // metodo para retornar as informações dos produtos no carrinho:
    public void exibirInfos() {
        System.out.println("Informações dos produtos no carrinho: ");
        for(int i=0;i< product.length;i++) {
            if(product[i]!=null) {
                System.out.println("Nome do produto: " + product[i].nome);
                System.out.println("Descricao do produto: " + product[i].descricao);
                System.out.println("Fabricante do produto: " + product[i].fabricante);
                System.out.println("Preco do produto: " + product[i].preco + " reais");
                System.out.println("-------------");
            }
        }
    }

    //metodo para exibir o valor total da compra:
    public double calculaTotal() {
        for(int i=0;i< product.length;i++) {
            if(product[i]!=null) {
                total+=product[i].preco;
            }
        }

        return total;
    }

    //construtor para chamar as funcoes:
    // associação por composição:
    public Carrinho_exercicio1() {
        product[0] = new Produto_exercicio1("Arroz", "Saco de arroz", "ComidasLTDA",19.20);
        product[1] = new Produto_exercicio1("Iphone 12", "Celular", "Apple",3000);
        product[2] = new Produto_exercicio1("Inspiration 15", "Notebook", "Dell",5000);
        exibirInfos();
        System.out.println("Valor total da compra: " + calculaTotal() + " reais");
    }

}
