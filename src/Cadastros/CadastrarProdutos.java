package Cadastros;

import Objetos.ArmazenaDados;
import Objetos.Bebida;
import Objetos.Pizza;
import Objetos.Sobremesa;

import java.math.BigDecimal;
import java.util.Scanner;

public class CadastrarProdutos extends ArmazenaDados {

    public static void cadastraPizza(Scanner sc){

            System.out.println();
            System.out.println("Bem vindo ao método de cadastrar pizzas");
            System.out.println("Por favor, digite o nome que será dado a essa pizza: ");
            String nomePizza = sc.next();
            System.out.println("Por favor, digite a descrição da pizza: ");
            String descricao = sc.nextLine();
            System.out.println("Por favor, digite o valor da pizza: ");
            BigDecimal valor = sc.nextBigDecimal();

            Pizza pizza = new Pizza(nomePizza,descricao,valor);
            listaPizzas.add(pizza);

            boolean ciclo = true;
            do {
                System.out.println("O que deseja fazer?");
                System.out.println("1 - Adicionar nova pizza");
                System.out.println("2 - Sair do modulo");
                String action = sc.next();
                System.out.println();

                switch (action){
                    case "1":
                        cadastraPizza(sc);
                    case "2":
                        ciclo = false;
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente");
                        break;
                }
            }while (ciclo);
    }

    public static void cadastraBebida(Scanner sc){
        System.out.println();
        System.out.println("Bem vindo ao método de cadastrar bebidas");
        System.out.println("Por favor, digite o nome da bebida: ");
        String nomeBebida = sc.nextLine();
        System.out.println("Por favor, digite o valor da bebida: ");
        BigDecimal valor = sc.nextBigDecimal();
        System.out.println();

        Bebida bebida = new Bebida(nomeBebida,valor);
        listaBebidas.add(bebida);

        boolean ciclo = true;
        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar nova bebida");
            System.out.println("2 - Sair do modulo");
            String action = sc.next();
            System.out.println();

            switch (action){
                case "1":
                    cadastraBebida(sc);
                case "2":
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }while (ciclo);

    }

    public static void cadastraSobremesa(Scanner sc){
        System.out.println();
        System.out.println("Bem vindo ao método de cadastrar sobremesas");
        System.out.println("Por favor, digite o nome que será dado a essa sobremesa: ");
        String nomeSobremesa = sc.next();
        System.out.println("Por favor, digite a descrição da sobremesa: ");
        String descricao = sc.nextLine();
        System.out.println("Por favor, digite o valor da sobremesa: ");
        BigDecimal valor = sc.nextBigDecimal();
        System.out.println();

        Sobremesa sobremesa = new Sobremesa(nomeSobremesa,descricao,valor);
        listaSobremesas.add(sobremesa);

        boolean ciclo = true;
        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar nova sobremesa");
            System.out.println("2 - Sair do modulo");
            String action = sc.next();
            System.out.println();

            switch (action){
                case "1":
                    cadastraSobremesa(sc);
                case "2":
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }while (ciclo);
    }


}
