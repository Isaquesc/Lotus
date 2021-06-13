package br.com.generation.los4hermanos.lotus.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id // IDENTIFICADOR
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Atributo Obrigatório")
    private String nome_usuario;

    @NotNull(message = "Atributo Obrigatório")
    private String email;

    @NotNull(message = "Atributo Obrigatório")
    private String senha;

    @NotNull(message = "Atributo Obrigatório")
    private String telefone;

    @NotNull(message = "Atributo Obrigatório")
    private String usuario;

    private String foto; // LINK FOTO DE PERFIL

    @NotNull(message = "Atributo Obrigatório")
    private String genero;

    @NotNull(message = "Atributo Obrigatório")
    private boolean pessoa_fisica;

    private String cpf;

    private String cnpj;

    private int pontuacao;

    // RELACIONAMENTO
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("usuario")
    private List<Postagem> postagem;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_usuario() {
        return this.nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public List<Postagem> getPostagem() {
        return this.postagem;
    }

    public void setPostagem(List<Postagem> postagem) {
        this.postagem = postagem;
    }


}