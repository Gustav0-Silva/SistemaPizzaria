package Objetos;


import java.math.BigDecimal;

public class Pedidos {

    private String nomeProduto;
    private BigDecimal valor;
    private int quantidade;

    public Pedidos(String nomeProduto, BigDecimal valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
