package com.example.testefragments.modelo;

import androidx.annotation.NonNull;

import java.util.List;

public class Itens {
    private String nome;
    private String data;
    private List<String> marcas;

    public Itens(String nome, String data, List<String> marcas) {
        this.nome = nome;
        this.data = data;
        this.marcas = marcas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }

    @NonNull
    @Override
    public String toString() {
        return this.nome;
    }
}
