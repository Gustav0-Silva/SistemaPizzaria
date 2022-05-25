package Telas;

import Cadastros.CadastrarCliente;
import Objetos.Verificacoes;

import java.util.Scanner;

public class Login {


    public static void executar(Scanner sc){
        boolean ciclo = true;
        do {
            System.out.println();
            System.out.println("Cliente já cadastrado ou deseja criar novo cadastro?");
            System.out.println("1 - Cliente cadastrado");
            System.out.println("2 - Novo cadastro");
            System.out.println("3 - Sair");

            String action = sc.next();

            if (action.equals("1")) {
                login(sc);
                ciclo = false;
            } else if (action.equals("2")) {
                //Cliente não cadastrado, partir para cadastro
            } else if (action.equals("3")) {
                System.out.println("Operação cancelada");
                ciclo = false;
            } else {
                System.out.println("Opção inválida, por favor, tente novamente");
            }
        }while (ciclo);
    }

    public static void login(Scanner sc){

        System.out.println();
        System.out.println("Por favor, digite seu login: ");
        String login = sc.next();
        System.out.println("Por favor, digite sua senha: ");
        String senha = sc.next();

        if (login.equals("Admin") && senha.equals("Admin")) {

            InterfaceAdm.executar(sc);

        } else {

            boolean existeCliente = Verificacoes.clienteExiste(login, senha);

            if (existeCliente == true) {
                InterfacePedido.fazerPedido(sc, login);

            } else {
                boolean cadastroErrado = true;
                do {
                    System.out.println("Cliente não encontrado em nosso banco de dados");
                    System.out.println("Deseja tentar novamente ou criar cadastro?");
                    System.out.println("1 - Tentar novamente");
                    System.out.println("2 - Criar cadastro");
                    System.out.println("3 - Sair");

                    String actionCadastro = sc.next();

                    if (actionCadastro.equals("1")) {
                        System.out.println();
                        login(sc);

                    } else if (actionCadastro.equals("2")) {
                        System.out.println();
                        CadastrarCliente.executar(sc);

                    } else if (actionCadastro.equals("3")) {
                        cadastroErrado = false;

                    }else {
                        System.out.println("Opção inválida, por favor, tente novamente");
                    }

                } while (cadastroErrado);

            }
        }
    }
}
