package Telas;

import Objetos.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class PedirSobremesa extends ArmazenaDados {

    public static void pedidoSobremesa(Scanner sc){
        System.out.println("Aqui estão sobremesas que temos em nosso cardápio: ");
        System.out.println();

        for (Sobremesa sobremesas: listaSobremesas) {
            System.out.println("Nome: " + sobremesas.getNome());
            System.out.println("Descrição: " + sobremesas.getDescricao());
            System.out.println("Valor: " + sobremesas.getValor());
            System.out.println("--------------------------------------");
        }

        boolean ciclo = true;

        do {
            System.out.println();
            System.out.println("Digite o nome da sobremesa que deseja: ");
            String nomeSobremesa = sc.next();
            Sobremesa sobremesa = Verificacoes.sobremesaExiste(nomeSobremesa);

            if (sobremesa.equals(null)){
                System.out.println("Nome da sobremesa não existe em nosso sistema, por favor, tente novamente");
            }else {
                int quantidade;
                do {
                    System.out.println("Por favor, digite a quantiade: ");
                    quantidade = sc.nextInt();
                }while (quantidade<0);


                String nomeProduto = sobremesa.getNome();
                BigDecimal valor = (sobremesa.getValor().multiply(BigDecimal.valueOf(quantidade)));
                Pedidos pedidos = new Pedidos(nomeProduto,valor,quantidade);
                pedidosTemp.add(pedidos);
                System.out.println("Sobremesa adidionada a sua compra");
                System.out.println();
                ciclo = false;
            }
        }while (ciclo);

    }
}
