package model;


/**
 *
 * @author Duda
 */

public class Autor {
    private Integer id;
    private String nome;
    private String origem;
    private boolean banda;

    public Autor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public boolean isBanda() {
        return banda;
    }

    public void setBanda(boolean banda) {
        this.banda = banda;
    }
}
