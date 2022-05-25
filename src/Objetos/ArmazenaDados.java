package Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmazenaDados {

    protected static List <Cliente> listaClientes = new ArrayList<>();
    protected static List <Pizza> listaPizzas = new ArrayList<>();
    protected static List <Bebida> listaBebidas = new ArrayList<>();
    protected static List <Sobremesa> listaSobremesas = new ArrayList<>();

    protected static List<Pedidos> pedidosTemp = new ArrayList<>();

    public static void limpaCompras(){
        for (Pedidos pedidos: pedidosTemp) {
            pedidosTemp.remove(pedidos);
        }
    }

    public static int bairros(Scanner sc){
        do {
            System.out.println();
            System.out.println("1 - Vila Santa Maria");
            System.out.println("2 - Jardim dos Operários");
            System.out.println("3 - Boa Vista");
            System.out.println("4 - Vila das Nações");

            String bairro = sc.next();

            switch (bairro){
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }while (true);
    }
}
