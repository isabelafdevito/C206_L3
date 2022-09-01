public class ClassePrincipal_exercicio2 {

    public static void main(String[] args) {


        Conta c1 = new Conta();
        Cliente cliente = new Cliente();

        c1.cliente = cliente;

        c1.cliente.setNome("isabela");
        c1.cliente.setCPF(12345678);

        c1.deposita(3500);
        c1.extrato();
        c1.saca(4000);
        c1.extrato();

        System.out.println("Quantidade de clientes no banco: " + Conta.getQntClientes());


    }
}
