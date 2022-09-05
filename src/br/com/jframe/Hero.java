/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jframe;

/**
 *
 * @author thiag
 */
public class Hero {
    
    private String name;
    private double height;
    private double weight;
    private int age;
    private String background;
    private int atrbPoints;
    private Atributtes atrPoints;

    public Hero(String name, double height, double weight, int age, String background, int atrbPoints, Atributtes atrPoints) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.background = background;
        this.atrbPoints = atrbPoints;
        this.atrPoints = atrPoints;
    }

    Hero(String name, double height, double weight, int age, Atributtes pnt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getAtrbPoints() {
        return atrbPoints;
    }

    public void setAtrbPoints(int atrbPoints) {
        this.atrbPoints = atrbPoints;
    }

    public Atributtes getAtrPoints() {
        return atrPoints;
    }

    public void setAtrPoints(Atributtes atrPoints) {
        this.atrPoints = atrPoints;
    }

    
}
