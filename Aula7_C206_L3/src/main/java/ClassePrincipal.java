public class ClassePrincipal {

    public static void main(String[] args) {

        Produto[] p1 = new Produto[5];

        Notebook n1 = new Notebook();
        n1.setNome("Dell");
        n1.setPreco(4300.00);
        n1.setArmazenamento(16);
        n1.setGpu("Onboard");
        n1.setProcessador("Intel core i7");
        p1[0] = n1;

        Camiseta c1 = new Camiseta();
        c1.setNome("Renner");
        c1.setPreco(30.00);
        c1.setCor("Amarelo");
        c1.setTamanho("P");
        p1[1] = c1;

        System.out.println("Informacoes das etiquetas dos produtos: ");
        for(int i=0;i<p1.length;i++) {
            if(p1[i] != null) {
                System.out.println(p1[i].etiquetaPreco());
            }
        }

    }

}
