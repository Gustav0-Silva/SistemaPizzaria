package Telas;

import Objetos.ArmazenaDados;
import Objetos.Pedidos;

import java.math.BigDecimal;

public class Exibir extends ArmazenaDados {

    public static void exibirPedido (){
        BigDecimal valorFinal = BigDecimal.valueOf(0);

        System.out.println("Itens dentro do pedido: ");
        System.out.println();
        for (Pedidos pedido: pedidosTemp) {
            System.out.println("Item: " + pedido.getNomeProduto());
            System.out.println("Quantiade: " + pedido.getQuantidade());
            System.out.println("Valor: " + pedido.getValor());
            System.out.println("-------------------------------------");
            valorFinal.add(pedido.getValor());
        }
        System.out.println("Valor final da compra: " + valorFinal);
        System.out.println();
    }
}
