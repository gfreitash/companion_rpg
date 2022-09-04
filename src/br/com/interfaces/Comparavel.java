package br.com.interfaces;

import java.util.Locale;

public abstract class Comparavel implements Comparable<Comparavel> {
    protected String identificador;

    public Comparavel(String identificador) {
        setIdentificador(identificador);
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = Comparavel.transformarIdentificador(identificador);
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
    
    public static String transformarIdentificador(String identificador) {
        return identificador.replace(" ", "_").toUpperCase(Locale.US);
    }
}
