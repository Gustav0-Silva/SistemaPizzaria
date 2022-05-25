package Telas;

import Objetos.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class PedirBebida extends ArmazenaDados {

    public static void pedidoBebida(Scanner sc){
        System.out.println("Aqui estão as bebidas do nosso menu: ");
        System.out.println();

        for (Bebida bebida: listaBebidas) {
            System.out.println("Nome: " + bebida.getNome());
            System.out.println("Valor: " + bebida.getValor());
            System.out.println("--------------------------------------");
        }

        boolean ciclo = true;
        do {
            System.out.println();
            System.out.println("Digite o nome da bebida que deseja: ");
            String nomeBebida = sc.next();
            Bebida bebida = Verificacoes.bebidaExiste(nomeBebida);

            if (bebida.equals(null)){
                System.out.println("Nome da pizza não existe em nosso sistema, por favor, tente novamente");
            }else {
                int quantidade;
                do {
                    System.out.println("Por favor, digite a quantiade: ");
                    quantidade = sc.nextInt();
                }while (quantidade<0);

                String nomeProduto = bebida.getNome();
                BigDecimal valor = (bebida.getValor().multiply(BigDecimal.valueOf(quantidade)));
                Pedidos pedidos = new Pedidos(nomeProduto,valor,quantidade);

                pedidosTemp.add(pedidos);
                System.out.println("Bebida adidionada a sua compra");
                System.out.println();
                ciclo = false;
            }

        }while (ciclo);
    }
}
