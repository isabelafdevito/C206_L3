import org.w3c.dom.ls.LSOutput;

public class Notebook extends Produto{

    private double armazenamento;
    private String gpu;
    private String processador;

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String etiquetaPreco() {
        return "Nome: " + getNome() + " / Preco: " + getPreco() + " / armazenamento: " + armazenamento + " / GPU: " + gpu + " / processador: " + processador;
    }
}
