/*Ex01*/


public class Pedido {
    private double valorTotal;
    private String tipoCliente;

    public Pedido(double valorTotal, String tipoCliente) {
        this.valorTotal = valorTotal;
        this.tipoCliente = tipoCliente;
    }

    // Método simplificado sem switch
    public double calcularDesconto() {
        double desconto = 0.0;

        if ("COMUM".equals(tipoCliente)) {
            desconto = 0.05; // 5%
        } else if ("VIP".equals(tipoCliente)) {
            desconto = 0.10; // 10%
        } else if ("FUNCIONARIO".equals(tipoCliente)) {
            desconto = 0.20; // 20%
        }

        return valorTotal * (1 - desconto);
    }

    // Método para exibir o resumo do pedido
    public void exibirResumo() {
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("Valor Original: R$" + valorTotal);
        System.out.println("Valor com Desconto: R$" + calcularDesconto());
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(100.0, "VIP");
        pedido1.exibirResumo();
    }
}