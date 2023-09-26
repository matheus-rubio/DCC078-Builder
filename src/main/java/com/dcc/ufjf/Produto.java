package com.dcc.ufjf;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;

    public Produto() {
        this.nome = "";
        this.preco = 0;
        this.descricao = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
