package Objetos;

public class Cliente {
    private String login;
    private String senha;
    private String nome;
    private String email;
    private String endereço;
    private int bairro;


    public Cliente(String login, String senha, String nome, String email, String endereço, int bairro) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.endereço = endereço;
        this.bairro = bairro;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }


    public String getEndereço() {
        return endereço;
    }

    public int getBairro() {
        return bairro;
    }
}
