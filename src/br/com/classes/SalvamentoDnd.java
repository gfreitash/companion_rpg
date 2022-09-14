package br.com.classes;

import java.util.Objects;

public class SalvamentoDnd {
    private String atributo;
    private String modificador;

    public SalvamentoDnd(String atributo, String modificador) {
        this.atributo = atributo;
        this.modificador = modificador;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
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
        SalvamentoDnd that = (SalvamentoDnd) o;
        return modificador == that.modificador && atributo.equals(that.atributo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atributo, modificador);
    }

    @Override
    public String toString() {
        return "SalvamentoDnd{" +
                "atributo='" + atributo + '\'' +
                ", modificador=" + modificador +
                '}';
    }
}
