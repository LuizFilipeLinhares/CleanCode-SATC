/*Ex04*/

final class Produto {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Produto aplicarDesconto(double desconto) {
        return new Produto(this.nome, this.preco - desconto);
    }
}

class CarrinhoDeCompras {
    private Produto produto;

    public CarrinhoDeCompras(Produto produto) {
        this.produto = produto;
    }

    public void adicionarProdutoAoCarrinho(Produto novoProduto) {
        this.produto = novoProduto;
    }

    public void finalizarCompra() {
        produto = produto.aplicarDesconto(10.0);
    }

    public void mostrarDetalhes() {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Laptop", 1500.00);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(produto1);

        Produto produto2 = new Produto("Smartphone", 1200.00);
        carrinho.adicionarProdutoAoCarrinho(produto2);

        carrinho.finalizarCompra();
        carrinho.mostrarDetalhes();
    }
}