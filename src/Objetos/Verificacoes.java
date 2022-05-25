package Objetos;

public class Verificacoes extends ArmazenaDados {


    public static boolean clienteExiste(String login, String senha){
        for (Cliente cliente : listaClientes ) {
            String comparaLogin = cliente.getLogin();
            String comparaSenha = cliente.getSenha();

            if (comparaLogin.equals(login) && comparaSenha.equals(senha)){
                return true;
            }
        }
        return false;
    }

    public static Pizza pizzaExiste(String nome){
        for (Pizza pizza: listaPizzas) {
            String comparaPizza = pizza.getNome();
            if (comparaPizza.equalsIgnoreCase(nome)){
                return pizza;
            }
        }
        return null;
    }

    public static Bebida bebidaExiste (String nome){
        for (Bebida bebidas: listaBebidas) {
            String comparaBebida = bebidas.getNome();
            if (comparaBebida.equalsIgnoreCase(nome)){
                return bebidas;
            }

        }
        return null;
    }

    public static Sobremesa sobremesaExiste (String nome){
        for (Sobremesa sobremsa: listaSobremesas) {
            String comparaSobremesa = sobremsa.getNome();
            if (comparaSobremesa.equalsIgnoreCase(nome)){
                return sobremsa;
            }
        }
        return null;
    }

    public static Pedidos pedidoExiste (String nome){
        for (Pedidos pedidos: pedidosTemp) {
            String comparaPedido = pedidos.getNomeProduto();
            if (comparaPedido.equalsIgnoreCase(nome)){
                return pedidos;
            }
        }
        return null;
    }

}
