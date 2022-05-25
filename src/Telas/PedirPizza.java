package Telas;

import Objetos.ArmazenaDados;
import Objetos.Pedidos;
import Objetos.Pizza;
import Objetos.Verificacoes;

import java.math.BigDecimal;
import java.util.Scanner;


public class PedirPizza extends ArmazenaDados {

    public static void pedidoUmSabor(Scanner sc){
        System.out.println("Aqui estão pizzas que temos em nosso cardápio: ");
        System.out.println();

        for (Pizza pizza: listaPizzas) {
            System.out.println("Nome: " + pizza.getNome());
            System.out.println("Descrição: " + pizza.getDescricao());
            System.out.println("Valor: " + pizza.getValor());
            System.out.println("--------------------------------------");
        }

        boolean ciclo = true;
        do {
            System.out.println();
            System.out.println("Digite o nome da pizza que deseja: ");
            String nomePizza = sc.next();
            Pizza pizza = Verificacoes.pizzaExiste(nomePizza);

            if (pizza.equals(null)){
                System.out.println("Nome da pizza não existe em nosso sistema, por favor, tente novamente");
            }else {
                int quantidade;
                do {
                    System.out.println("Por favor, digite a quantiade: ");
                    quantidade = sc.nextInt();
                }while (quantidade<0);


                String nomeProduto = pizza.getNome();
                BigDecimal valor = (pizza.getValor().multiply(BigDecimal.valueOf(quantidade)));
                Pedidos pedidos = new Pedidos(nomeProduto,valor,quantidade);
                pedidosTemp.add(pedidos);
                System.out.println("Pizza adidionada a sua compra");
                System.out.println();
                ciclo = false;
            }
        }while (ciclo);

    }

    public static void pedidoDoisSabores(Scanner sc){
        System.out.println("Aqui estão pizzas que temos em nosso cardápio: ");
        System.out.println();

        for (Pizza pizza: listaPizzas) {
            System.out.println("Nome: " + pizza.getNome());
            System.out.println("Descrição: " + pizza.getDescricao());
            System.out.println("Valor: " + pizza.getValor());
            System.out.println("--------------------------------------");
        }


        boolean ciclo = true;
        Pizza pizza1;
        BigDecimal valorPizza1 = BigDecimal.valueOf(0);
        do {
            System.out.println();
            System.out.println("Digite o nome do primeiro sabor de pizza que deseja: ");
            String nomePizza = sc.next();
            pizza1 = Verificacoes.pizzaExiste(nomePizza);

            if (pizza1.equals(null)) {
                System.out.println("Nome da pizza não existe em nosso sistema, por favor, tente novamente");
            }else {
                valorPizza1 = pizza1.getValor();
                ciclo = false;
            }
        }while (ciclo);

        ciclo = true;

        Pizza pizza2;
        BigDecimal valorPizza2 = BigDecimal.valueOf(0);
        do {
            System.out.println();
            System.out.println("Digite o nome do segundo sabor de pizza que deseja: ");
            String nomePizza = sc.next();
            pizza2 = Verificacoes.pizzaExiste(nomePizza);

            if (pizza2.equals(null)) {
                System.out.println("Nome da pizza não existe em nosso sistema, por favor, tente novamente");
            }else {
                valorPizza2 = pizza2.getValor();
                ciclo = false;
            }
        }while (ciclo);

        String nomePizza = pizza1.getNome() + pizza2.getNome();
        BigDecimal valor;

        if (valorPizza1.compareTo(valorPizza2) == 1){
            valor = valorPizza1;
        }else {
            valor = valorPizza2;
        }

        int quantidade;
        do {
            System.out.println("Por favor, digite a quantiade: ");
            quantidade = sc.nextInt();
        }while (quantidade<0);

        valor.multiply(BigDecimal.valueOf(quantidade));

        Pedidos pedidos = new Pedidos(nomePizza,valor,quantidade);
        pedidosTemp.add(pedidos);
        System.out.println("Pizza adidionada a sua compra");
        System.out.println();

    }
}
