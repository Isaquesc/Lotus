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
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_tema")
public class Tema {


    @Id // IDENTIFICADOR DO TEMA
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull (message = "Atributo Obrigatório")
    @Size(min = 4, max = 50)
    private String nome_tema;
    
    @Size(min = 4, max = 255)
    private String descricao_tema;

    private String palavraChave;

    @OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("tema")
    private List<Postagem> postagem;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_tema() {
        return this.nome_tema;
    }

    public void setNome_tema(String nome_tema) {
        this.nome_tema = nome_tema;
    }

    public String getDescricao_tema() {
        return this.descricao_tema;
    }

    public void setDescricao_tema(String descricao_tema) {
        this.descricao_tema = descricao_tema;
    }

    public String getPalavraChave() {
        return this.palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public List<Postagem> getPostagem() {
        return this.postagem;
    }

    public void setPostagem(List<Postagem> postagem) {
        this.postagem = postagem;
    }
    

}