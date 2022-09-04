package br.com.classes;

public class PericiaDnd {
    private String pericia;
    private int modificador;

    public PericiaDnd(String pericia, int modificador) {
        this.pericia = pericia;
        this.modificador = modificador;
    }

    public String getPericia() {
        return pericia;
    }

    public void setPericia(String pericia) {
        this.pericia = pericia;
    }

    public int getModificador() {
        return modificador;
    }

    public void setModificador(int modificador) {
        this.modificador = modificador;
    }
}
