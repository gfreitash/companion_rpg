package br.com.classes;

public class SalvamentoDnd {
    private String atributo;
    private int modificador;

    public SalvamentoDnd(String atributo, int modificador) {
        this.atributo = atributo;
        this.modificador = modificador;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public int getModificador() {
        return modificador;
    }

    public void setModificador(int modificador) {
        this.modificador = modificador;
    }
}
