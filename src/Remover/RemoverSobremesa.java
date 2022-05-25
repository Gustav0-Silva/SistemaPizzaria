package Remover;

import Objetos.ArmazenaDados;
import Objetos.Pizza;
import Objetos.Sobremesa;
import Objetos.Verificacoes;
import Telas.InterfaceAdm;

import java.util.Scanner;

public class RemoverSobremesa extends ArmazenaDados {

    public static void RemoveSobremesa(Scanner sc){
        System.out.println();
        System.out.println("Bem vindo ao método de remover sobremesas");
        System.out.println("Digite o nome da sobremesa que deseja remover");
        String nomeSobremesa = sc.next();
        System.out.println();

        Sobremesa sobremesa = Verificacoes.sobremesaExiste(nomeSobremesa);

        if (sobremesa.equals(null)){
            boolean ciclo = true;
            do {
                System.out.println("Sobremesa não existe no sistema, o que deseja fazer?");
                System.out.println("1 - Tentar novamente");
                System.out.println("2 - Sair");
                String action = sc.next();

                switch (action){
                    case "1":
                        RemoveSobremesa(sc);
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
                System.out.println("A sobremesa foi encontrada");
                System.out.println("Nome: " + sobremesa.getNome());
                System.out.println("Descrição: " + sobremesa.getDescricao());
                System.out.println("Valor: " + sobremesa.getValor());
                System.out.println();
                System.out.println("Deseja realmente remover? ");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                String action = sc.next();

                switch (action){
                    case "1":
                        listaSobremesas.remove(sobremesa);
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
