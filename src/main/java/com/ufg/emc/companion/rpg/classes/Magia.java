/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufg.emc.companion.rpg.classes;

/**
 *
 * @author gfreitash
 */
public class Magia {
    private String nome;
    private String descricao;
    private boolean causaDano;
    private String dano;
    private String salvamento;

    public Magia(String nome, String descricao, String salvamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.salvamento = salvamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCausaDano() {
        return causaDano;
    }

    public void setCausaDano(boolean causaDano) {
        this.causaDano = causaDano;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }

    public String getSalvamento() {
        return salvamento;
    }

    public void setSalvamento(String salvamento) {
        this.salvamento = salvamento;
    }
}
