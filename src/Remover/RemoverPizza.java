package Remover;

import Objetos.ArmazenaDados;
import Objetos.Pizza;
import Objetos.Verificacoes;
import Telas.InterfaceAdm;

import java.util.Scanner;

public class RemoverPizza extends ArmazenaDados {

    public static void RemovePizza(Scanner sc){
        System.out.println();
        System.out.println("Bem vindo ao método de remover pizzas");
        System.out.println("Digite o nome da pizza que deseja remover");
        String nomePizza = sc.next();
        System.out.println();

        Pizza pizza = Verificacoes.pizzaExiste(nomePizza);

        if (pizza.equals(null)){
            boolean ciclo = true;
            do {
            System.out.println("Pizza não existe no sistema, o que deseja fazer?");
            System.out.println("1 - Tentar novamente");
            System.out.println("2 - Sair");
            String action = sc.next();

                switch (action){
                    case "1":
                        RemovePizza(sc);
                    case "2":
                        InterfaceAdm.executar(sc);
                    default:
                        System.out.println("Opção inválida");
                }
            }while(ciclo);
        }else {

            boolean ciclo = true;
            do {

                System.out.println();
                System.out.println("A pizza foi encontrada");
                System.out.println("Nome: " + pizza.getNome());
                System.out.println("Descrição: " + pizza.getDescricao());
                System.out.println("Valor: " + pizza.getValor());
                System.out.println();
                System.out.println("Deseja realmente remover? ");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                String action = sc.next();

                switch (action){
                    case "1":
                        listaPizzas.remove(pizza);
                        ciclo = false;
                        break;
                    case "2":
                        InterfaceAdm.executar(sc);
                    default:
                        System.out.println("Opção inválida");
                        System.out.println();
                        break;
                }
            }while (ciclo);
        }
    }
}
