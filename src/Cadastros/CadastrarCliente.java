package Cadastros;

import Objetos.ArmazenaDados;
import Objetos.Cliente;

import java.util.Scanner;

public class CadastrarCliente extends ArmazenaDados {

    public static void executar(Scanner sc){
        System.out.println("Bem vindo ao Cadastro de Clientes");
        System.out.println("Por favor, informe seu nome: ");
        String nome = sc.next();
        System.out.println("Por favor, digite seu login: ");
        String login = sc.next();

        boolean confirmaSenha = true;

        String senha;

        do {
            System.out.println("Por favor, digite sua senha: ");
            senha = sc.next();
            System.out.println("Confirme a senha digitada: ");
            String senhaConfirmada = sc.next();

            if (senha.equals(senhaConfirmada)){
                confirmaSenha = false;
            }else {
                System.out.println("As senhas não conferem, tente novamente por favor");
                System.out.println();
            }
        }while(confirmaSenha);

        System.out.println("Por favor, digite seu e-mail: ");
        String email = sc.next();
        System.out.println("Por favor, digite o nome e número da rua: ");
        String endereco = sc.nextLine();
        System.out.println("Selecione um dos bairros dos quais fazemos entregas: ");
        int bairro = bairros(sc);

        Cliente cliente = new Cliente(login,senha,nome,email,endereco,bairro);
        listaClientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println();
    }

}
