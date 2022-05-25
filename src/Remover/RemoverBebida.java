package Remover;

import Objetos.ArmazenaDados;
import Objetos.Bebida;
import Objetos.Verificacoes;
import Telas.InterfaceAdm;

import java.util.Scanner;

public class RemoverBebida extends ArmazenaDados {

    public static void RemoveBebida(Scanner sc){
        System.out.println();
        System.out.println("Bem vindo ao método de remover bebidas");
        System.out.println("Digite o nome da bebida que deseja remover");
        String nomeBebida = sc.next();
        System.out.println();

        Bebida bebida = Verificacoes.bebidaExiste(nomeBebida);

        if (bebida.equals(null)) {
            boolean ciclo = true;
            do {
                System.out.println("Bebida não existe no sistema, o que deseja fazer?");
                System.out.println("1 - Tentar novamente");
                System.out.println("2 - Sair");
                String action = sc.next();

                switch (action) {
                    case "1":
                        RemoveBebida(sc);
                    case "2":
                        InterfaceAdm.executar(sc);
                    default:
                        System.out.println("Opção inválida");
                }
            } while (ciclo);
        }else {

            boolean ciclo = true;
            do {

                System.out.println();
                System.out.println("A bebida foi encontrada");
                System.out.println("Nome: " + bebida.getNome());
                System.out.println("Valor: " + bebida.getValor());
                System.out.println();
                System.out.println("Deseja realmente remover? ");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                String action = sc.next();

                switch (action){
                    case "1":
                        listaBebidas.remove(bebida);
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
