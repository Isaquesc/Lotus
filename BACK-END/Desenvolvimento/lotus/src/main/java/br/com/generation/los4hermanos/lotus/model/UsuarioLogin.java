package br.com.generation.los4hermanos.lotus.model;

import javax.security.auth.x500.X500Principal;

import kotlin.jvm.internal.Ref.BooleanRef;

public class UsuarioLogin {

    private long id;
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private String telefone;
    private String cpf;
    private String cnpj;   
    private String token;
    private String foto;
    private String tipo;
    private String genero;
    private boolean pessoa_fisica;
    private int score;
    


// ----------   GETTERS AND SETTERS ---------

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isPessoa_fisica() {
        return this.pessoa_fisica;
    }

    public boolean getPessoa_fisica() {
        return this.pessoa_fisica;
    }

    public void setPessoa_fisica(boolean pessoa_fisica) {
        this.pessoa_fisica = pessoa_fisica;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }



}
