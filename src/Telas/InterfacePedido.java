package Telas;
import Objetos.ArmazenaDados;
import Remover.RemoverProdutoCompra;

import java.util.Scanner;

public class InterfacePedido {

    public static void fazerPedido(Scanner sc, String nomeCliente){
        boolean ciclo=true;

        System.out.println("Bem vindo!");
        System.out.println();

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Pedir pizza 1 sabore");
            System.out.println("2 - Pedir pizza 2 sabores");
            System.out.println("3 - Pedir bebida");
            System.out.println("4 - Pedir sobremesa");
            System.out.println("5 - Remover um produto");
            System.out.println("6 - Exibir pedido");
            System.out.println("7 - Finalizar pedido");
            System.out.println("8 - Cancelar e sair");
            String action = sc.next();
            System.out.println();

            switch (action){
                case "1":
                    PedirPizza.pedidoUmSabor(sc);
                    break;
                case "2":
                    PedirPizza.pedidoDoisSabores(sc);
                    break;
                case "3":
                    PedirBebida.pedidoBebida(sc);
                    break;
                case "4":
                    PedirSobremesa.pedidoSobremesa(sc);
                    break;
                case "5":
                    RemoverProdutoCompra.remover(sc);
                case "6":
                    System.out.println("Seu pedido até o momento é: ");
                    Exibir.exibirPedido();
                    break;
                case "7":
                    //finalizar pedido
                    ciclo = false;
                case "8":
                    ArmazenaDados.limpaCompras();
                    ciclo = false;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    System.out.println();
                    break;
            }


        }while (ciclo);


    }

}
