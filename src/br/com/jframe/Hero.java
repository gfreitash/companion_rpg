package br.com.jframe;

public class Hero {
    private String name;
    private double height;
    private double weight;
    private int age;
    private String race;
    private String clan;

    public Hero(String name, double height, double weight, int age, String race, String clan) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.race = race;
        this.clan = clan;
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }
 
    public void CreateHero(String name, double height, double weight, int age, String race, String clan){
        
    }
   
            
}
