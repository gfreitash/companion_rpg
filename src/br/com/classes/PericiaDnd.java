package br.com.classes;

import java.util.Objects;

public class PericiaDnd {
    private String pericia;
    private String modificador;

    public PericiaDnd(String pericia, String modificador) {
        this.pericia = pericia;
        this.modificador = modificador;
    }

    public String getPericia() {
        return pericia;
    }

    public void setPericia(String pericia) {
        this.pericia = pericia;
    }

    public String getModificador() {
        return modificador;
    }

    public void setModificador(String modificador) {
        this.modificador = modificador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PericiaDnd that = (PericiaDnd) o;
        return modificador == that.modificador && pericia.equals(that.pericia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pericia, modificador);
    }

    @Override
    public String toString() {
        return "PericiaDnd{" +
                "pericia='" + pericia + '\'' +
                ", modificador=" + modificador +
                '}';
    }
}
