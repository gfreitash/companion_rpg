/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufg.emc.companion.rpg.classes;

/**
 *
 * @author gfreitash
 */
public class Item {
    private double valor;
    private String nome;
    private String descricao;
    private Item.TIPO tipo;
    private boolean magico;

    enum TIPO {
        ARMA, ARMADURA, MISCELANIA
    }

    public Item(double valor, String nome, String descricao, Item.TIPO tipo, boolean magico) {
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.magico = magico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public TIPO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    public boolean isMagico() {
        return magico;
    }

    public void setMagico(boolean magico) {
        this.magico = magico;
    }
}
