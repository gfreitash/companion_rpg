/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;

import br.com.interfaces.Comparavel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author gfreitash
 */
public class NpcDnd extends Comparavel{
    public enum ALINHAMENTO {
        LAWFUL_GOOD("Lawful Good"), NEUTRAL_GOOD("Neutral Good"), CHAOTIC_GOOD("Chaotic Good"),
        LAWFUL_NEUTRAL("Lawful Neutral"), TRUE_NEUTRAL("True Neutral"), CHAOTIC_NEUTRAL("Chaotic Neutral"),
        LAWFUL_EVIL("Lawful Evil"), NEUTRAL_EVIL("Neutral Evil"), CHAOTIC_EVIL("Chaotic Evil");
        private final String alinhamento;
        ALINHAMENTO(String alinhamento) {
            this.alinhamento = alinhamento;
        }

        @Override
        public String toString() {
            return alinhamento;
        }
    }
    private String nome;
    private double classeDificuldade;
    private String alinhamento;

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
    public Comparavel editarObjeto(String id) {
        NpcDnd npc = new NpcDnd(id, this.nome, this.classeDificuldade, this.alinhamento, this.classeArmadura,
                this.hitPoints, this.velocidade,
                this.forca, this.destreza, this.constituicao, this.inteligencia, this.sabedoria, this.carisma);

        npc.pericias.addAll(this.pericias);
        npc.salvamentos.addAll(this.salvamentos);
        npc.acoes.addAll(this.acoes);

        return npc;
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

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
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

    public boolean adicionarPericia(PericiaDnd pericia) {
        return pericias.add(pericia);
    }
    public boolean adicionarPericia(String nome, String modificador) {
        return pericias.add(new PericiaDnd(nome, modificador));
    }

    public boolean adicionarAcao(Acao acao) {
        return acoes.add(acao);
    }

    public boolean adicionarAcao(String nome, String descricao) {
        return acoes.add(new Acao(nome, descricao));
    }

    public boolean adicionarSalvamento(SalvamentoDnd salvamento) {
        return salvamentos.add(salvamento);
    }

    public boolean adicionarSalvamento(String nome, String modificador) {
        return salvamentos.add(new SalvamentoDnd(nome, modificador));
    }

    public boolean removerPericia(PericiaDnd pericia) {
        return pericias.remove(pericia);
    }

    public boolean removerAcao(Acao acao) {
        return acoes.remove(acao);
    }

    public boolean removerSalvamento(SalvamentoDnd salvamento) {
        return salvamentos.remove(salvamento);
    }
}
