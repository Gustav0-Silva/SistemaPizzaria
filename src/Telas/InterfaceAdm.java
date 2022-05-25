package Telas;

import Cadastros.CadastrarProdutos;
import Remover.RemoverBebida;
import Remover.RemoverPizza;
import Remover.RemoverSobremesa;

import java.util.Scanner;

public class InterfaceAdm {

    public static void executar(Scanner sc){
        boolean ciclo = true;

        do {
            System.out.println("Bem vindo a interface de administração, o que deseja fazer?");
            System.out.println("1 - Adicionar uma nova pizza");
            System.out.println("2 - Adicionar uma nova bebida");
            System.out.println("3 - Adicionar uma sobremesa");
            System.out.println("4 - Remover uma pizza");
            System.out.println("5 - Remover uma bebida");
            System.out.println("6 - Remover uma sobremesa");
            System.out.println("7 - Listar últimos pedidos");
            System.out.println("8 - Sair do sistema");

            String action = sc.next();

            switch (action) {
                case "1":
                    CadastrarProdutos.cadastraPizza(sc);
                    break;
                case "2":
                    CadastrarProdutos.cadastraBebida(sc);
                    break;
                case "3":
                    CadastrarProdutos.cadastraSobremesa(sc);
                    break;
                case "4":
                    RemoverPizza.RemovePizza(sc);
                    break;
                case "5":
                    RemoverBebida.RemoveBebida(sc);
                    break;
                case "6":
                    RemoverSobremesa.RemoveSobremesa(sc);
                    break;
                case "7":
                    //metodo de listagem
                    break;
                case "8":
                    System.out.println("Saindo da interface de Administração");
                    ciclo = false;
                default:
                    System.out.println("Opção incompatível, por favor tente novamente");
                    System.out.println();
            }

        }while (ciclo);




    }
}
