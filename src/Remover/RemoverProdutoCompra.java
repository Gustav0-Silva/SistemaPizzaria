package Remover;

import Objetos.ArmazenaDados;
import Objetos.Pedidos;
import Objetos.Verificacoes;
import Telas.Exibir;

import java.util.Scanner;

public class RemoverProdutoCompra extends ArmazenaDados {

    public static void remover(Scanner sc){
            if (pedidosTemp.equals(null)){
                System.out.println("Ainda não há produtos para remover");
                return;
            }


            Exibir.exibirPedido();
            System.out.println("Por favor, digite o nome do produto que quer remover");
            String nomeProduto = sc.next();

            Pedidos pedido = Verificacoes.pedidoExiste(nomeProduto);

            if (pedido.equals(null)){
                System.out.println("O produto não está adicionado as suas compras");
                do {
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Tentar novamente");
                    System.out.println("2 - Sair do modo");
                    String action = sc.next();

                    if (action.equals("1")){
                        remover(sc);
                    } else if (action.equals("2")) {
                        return;
                    }else {
                        System.out.println("Opção inválida, tente novamente");
                    }
                }while(true);
            }else {
                pedidosTemp.remove(pedido);
                System.out.println("O produto foi removido da sua lista de compras");
                System.out.println();
            }
    }

}
