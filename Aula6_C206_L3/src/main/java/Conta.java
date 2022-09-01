public class Conta {

    Cliente cliente;

    private static int qntClientes;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getQntClientes() {
        return qntClientes;
    }

    public Conta() {
        System.out.println("Criando nova conta..");
        qntClientes++;
    }

    public void deposita (double valor) {
        System.out.println("Dinheiro depositado com sucesso!");
        saldo = saldo + valor;
    }

    public void saca (double valor) {
        if(valor <= saldo) {
            System.out.println("Valor sacado com sucesso!");
            saldo = saldo - valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void extrato() {
        System.out.println("Seu saldo eh de: R$" + saldo);
    }

}
