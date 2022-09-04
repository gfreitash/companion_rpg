/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;

import br.com.interfaces.Comparavel;

import java.util.Objects;

/**
 *
 * @author gfreitash
 */
public class Item extends Comparavel {
    private String nome;
    private String descricao;
    private double valor;
    private Item.TIPO tipo;
    private boolean magico;

    public enum TIPO {
        ARMA, ARMADURA, MISCELANIA
    }

    public Item(String nome, String descricao, double valor, Item.TIPO tipo, boolean magico) {
        super(nome);
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.magico = magico;
    }

    public Item(String identificador, String nome, String descricao, double valor, Item.TIPO tipo, boolean magico) {
        super(identificador);
        this.valor = valor;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.magico = magico;
    }

    public Item(String identificador) {
        super(identificador);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.valor, valor) == 0 && magico == item.magico && nome.equals(item.nome) && descricao.equals(item.descricao) && tipo == item.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, nome, descricao, tipo, magico);
    }

    @Override
    public String toString() {
        return "Item{" +
                "valor=" + valor +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", magico=" + magico +
                ", identificador='" + identificador + '\'' +
                '}';
    }
}
