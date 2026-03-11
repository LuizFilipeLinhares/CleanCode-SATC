package com.empresa.financeiro;

/**
 * Classe responsável por realizar cálculos de descontos em compras.
 */
public class CalculadoraDescontos {

    /**
     * Aplica um desconto de 10% para compras acima de R$ 500,00
     * e 20% para compras acima de R$ 1000,00.
     *
     * @param valorCompra 
     * @return 
     */
    public double calcularDesconto(double valorCompra) {
        if (valorCompra > 1000) {
            return valorCompra * 0.80;
        }

        // Aplica desconto de 10% se a compra for acima de 500
        if (valorCompra > 500) {
            return valorCompra * 0.90; 
        }
        return valorCompra;
    }

    /**
     * Calcula um desconto especial para clientes VIP.
     * Clientes VIP sempre recebem um desconto fixo de 15%.
     *
     * @param valorCompra 
     * @return 
     */
    public double calcularDescontoVip(double valorCompra) {
        return valorCompra * 0.85; // Aplica 15% de desconto fixo para VIPs
    }

    public void metodoInutil() {
    }
}