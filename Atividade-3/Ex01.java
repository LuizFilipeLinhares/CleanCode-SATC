public class Pedido {
    private double valorTotal;
    private Cliente cliente;

    public Pedido(double valorTotal, Cliente cliente) {
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public double calcularDesconto() {
        return valorTotal * (1 - cliente.getDesconto());
    }

    public void exibirResumo() {
        System.out.println("Tipo de Cliente: " + cliente.getTipo());
        System.out.println("Valor Original: R$" + valorTotal);
        System.out.println("Valor com Desconto: R$" + calcularDesconto());
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(100.0, new ClienteVIP());
        pedido1.exibirResumo();

        Pedido pedido2 = new Pedido(200.0, new ClienteComum());
        pedido2.exibirResumo();

        Pedido pedido3 = new Pedido(500.0, new ClienteFuncionario());
        pedido3.exibirResumo();
    }
}

// Interface ou classe abstrata para Cliente
interface Cliente {
    double getDesconto();
    String getTipo();
}

// Implementações concretas
class ClienteComum implements Cliente {
    public double getDesconto() { return 0.05; }
    public String getTipo() { return "COMUM"; }
}

class ClienteVIP implements Cliente {
    public double getDesconto() { return 0.10; }
    public String getTipo() { return "VIP"; }
}

class ClienteFuncionario implements Cliente {
    public double getDesconto() { return 0.20; }
    public String getTipo() { return "FUNCIONARIO"; }
}