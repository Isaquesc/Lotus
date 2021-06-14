package br.com.generation.los4hermanos.lotus.model;

public class UserLogin {

    private String nome;
    private String usuario;
    private String email;
    private String cpf;
    private String senha;
    private String token;

    public UserLogin(Usuario usuario) {
        this.nome = usuario.getNome();
        this.usuario = usuario.getUsuario();
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.cpf = usuario.getCpf();
    }

    public UserLogin() {

    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
