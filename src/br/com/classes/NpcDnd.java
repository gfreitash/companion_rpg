/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;

import br.com.interfaces.Comparavel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gfreitash
 */
public class NpcDnd {
    private String nome;
    private double classeDificuldade;
    private String alinhamento;

    private int classeArmadura;
    private double hitPoints;
    private double velocidadeTerrestre;
    private double velocidadeAquatica;
    private double velocidadeAerea;

    private int forca;
    private int destreza;
    private int constituicao;
    private int sabedoria;
    private int carisma;
    private final List<PericiaDnd> pericias = new ArrayList<>();
    private final List<SalvamentoDnd> salvamentos = new ArrayList<>();

    private final List<Acao> acoes = new ArrayList<>();

    public NpcDnd() {
        
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean equals(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
