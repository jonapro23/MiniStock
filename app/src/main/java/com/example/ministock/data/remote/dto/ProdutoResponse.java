package main.java.com.example.ministock.data.remote.dto;

import com.google.gson.annotations.SerializedName;

public class ProdutoResponse {
    @SerializedName("")
    private string nome;

    @SerilizedName("")
    private double preco;

    private String descricao;

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preco;
    }

    public String getDescrição() {
        return descricao;
    }
}
