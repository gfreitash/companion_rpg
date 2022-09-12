/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;

import br.com.interfaces.Comparavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author gfreitash
 */
public class NpcDnd extends Comparavel{
    private String nome;
    private double classeDificuldade;
    private String alinhamento;
    
    public static final String LG = "Lawful Good";
    public static final String LN = "Lawful Neutral";
    public static final String LE = "Lawful Evil";
    public static final String NG = "Neutral Good";
    public static final String TG = "True Neutral";
    public static final String NE = "Neutral Evil";
    public static final String CG = "Chaotic Good";
    public static final String CN = "Chaotic Neutral";
    public static final String CE = "Chaotic Evil";

    private int classeArmadura;
    private double hitPoints;
    private double velocidade;

    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private final List<PericiaDnd> pericias = new ArrayList<>();
    private final List<SalvamentoDnd> salvamentos = new ArrayList<>();

    private final List<Acao> acoes = new ArrayList<>();

    public NpcDnd(String nome, double classeDificuldade, String alinhamento, int classeArmadura, double hitPoints, double velocidade, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        super(nome);
        this.nome = nome;
        this.classeDificuldade = classeDificuldade;
        this.alinhamento = alinhamento;
        this.classeArmadura = classeArmadura;
        this.hitPoints = hitPoints;
        this.velocidade = velocidade;
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
    }

    public NpcDnd(String identificador, String nome, double classeDificuldade, String alinhamento, int classeArmadura, double hitPoints, double velocidade, int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        super(identificador);
        this.nome = nome;
        this.classeDificuldade = classeDificuldade;
        this.alinhamento = alinhamento;
        this.classeArmadura = classeArmadura;
        this.hitPoints = hitPoints;
        this.velocidade = velocidade;
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
    }

    public NpcDnd(String id) {
        super(id);
    }

    @Override
    public Comparavel getModelo(String id) {
        return new NpcDnd(id);
    }

    @Override
    public Comparavel editarObjeto(String id) {
        return new NpcDnd(id, this.nome, this.classeDificuldade, this.alinhamento, this.classeArmadura,
                this.hitPoints, this.velocidade,
                this.forca, this.destreza, this.constituicao, this.inteligencia, this.sabedoria, this.carisma);
    }

    @Override
    public String toString() {
        return "NpcDnd{" +
                "nome='" + nome + '\'' +
                ", classeDificuldade=" + classeDificuldade +
                ", alinhamento='" + alinhamento + '\'' +
                ", classeArmadura=" + classeArmadura +
                ", hitPoints=" + hitPoints +
                ", velocidadeTerrestre=" + velocidade +
                ", forca=" + forca +
                ", destreza=" + destreza +
                ", constituicao=" + constituicao +
                ", inteligencia=" + inteligencia +
                ", sabedoria=" + sabedoria +
                ", carisma=" + carisma +
                ", pericias=" + pericias +
                ", salvamentos=" + salvamentos +
                ", acoes=" + acoes +
                ", identificador='" + identificador + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NpcDnd npcDnd = (NpcDnd) o;
        return Double.compare(npcDnd.classeDificuldade, classeDificuldade) == 0 && Double.compare(npcDnd.velocidade, velocidade) == 0 && forca == npcDnd.forca && destreza == npcDnd.destreza && constituicao == npcDnd.constituicao && inteligencia == npcDnd.inteligencia && sabedoria == npcDnd.sabedoria && carisma == npcDnd.carisma && nome.equals(npcDnd.nome) && Objects.equals(alinhamento, npcDnd.alinhamento) && pericias.equals(npcDnd.pericias) && salvamentos.equals(npcDnd.salvamentos) && acoes.equals(npcDnd.acoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, classeDificuldade, alinhamento, velocidade, forca, destreza, constituicao, inteligencia, sabedoria, carisma, pericias, salvamentos, acoes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getClasseDificuldade() {
        return classeDificuldade;
    }

    public void setClasseDificuldade(double classeDificuldade) {
        this.classeDificuldade = classeDificuldade;
    }

    public String getAlinhamento() {
        return alinhamento;
    }

    public void setAlinhamento(String alinhamento) {
        this.alinhamento = alinhamento;
    }

    public int getClasseArmadura() {
        return classeArmadura;
    }

    public void setClasseArmadura(int classeArmadura) {
        this.classeArmadura = classeArmadura;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double getVelocidadeTerrestre() {
        return velocidade;
    }

    public void setVelocidadeTerrestre(double velocidadeTerrestre) {
        this.velocidade = velocidadeTerrestre;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public List<PericiaDnd> getPericias() {
        return new ArrayList<>(pericias);
    }

    public List<SalvamentoDnd> getSalvamentos() {
        return new ArrayList<>(salvamentos);
    }

    public List<Acao> getAcoes() {
        return new ArrayList<>(acoes);
    }

    public boolean addPericia(PericiaDnd pericia) {
        return pericias.add(pericia);
    }

    public boolean addAcao(Acao acao) {
        return acoes.add(acao);
    }

    public boolean addSalvamento(SalvamentoDnd salvamento) {
        return salvamentos.add(salvamento);
    }

    public boolean removePericia(PericiaDnd pericia) {
        return pericias.remove(pericia);
    }

    public boolean removeAcao(Acao acao) {
        return acoes.remove(acao);
    }

    public boolean removeSalvamento(SalvamentoDnd salvamento) {
        return salvamentos.remove(salvamento);
    }
}
