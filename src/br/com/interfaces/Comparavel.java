package br.com.interfaces;

public abstract class Comparavel implements Comparable<Comparavel> {
    protected String identificador;

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador.toUpperCase();
    }

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object object);

    @Override
    public abstract String toString();

    public int compareTo(Comparavel o) {
        return identificador.compareTo(o.identificador);
    }
}
