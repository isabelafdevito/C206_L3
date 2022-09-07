public class Camiseta extends Produto {

    private String cor;
    private String tamanho;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String etiquetaPreco() {
        return "Nome: " + getNome() + " / Preco: " + getPreco() + " / Cor: " + cor + " / Tamanho: " + tamanho;
    }
}
