import Cadastros.CadastrarCliente;
import Telas.Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean ciclo = true;

        do {
            System.out.println("Bem vindo ao sistema da pizzaria");
            System.out.println("Digite o que deseja fazer: ");
            System.out.println();
            System.out.println("1 - Pedir pizza");
            System.out.println("2 - Cadastrar novo cliente");
            System.out.println("3 - Sair do sistema");

            String action = sc.next();

            if (action.equals("1")){
                Login.executar(sc);

            } else if (action.equals("2")) {
                CadastrarCliente.executar(sc);
            } else if (action.equals("3")) {
                System.out.println("Até breve!");
                ciclo = false;
            } else{
                System.out.println("O número digitado não corresponde a nenhuma das alternativas");
            }

        }while(ciclo);


    }
}