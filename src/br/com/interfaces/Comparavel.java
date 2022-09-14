package br.com.interfaces;

import java.util.List;
import java.util.Locale;

public abstract class Comparavel implements Comparable<Comparavel> {
    protected String identificador;

    public Comparavel(String identificador) {
        setIdentificador(identificador);
    }

    public String getIdentificador() {
        return identificador;
    }

    private void setIdentificador(String identificador) {
        this.identificador = Comparavel.transformarIdentificador(identificador);
    }
    
    public abstract Comparavel editarObjeto(String id);

    public int compareTo(Comparavel o) {
        return identificador.compareTo(o.identificador);
    }
    
    private static String transformarIdentificador(String identificador) {
        return identificador.replace(" ", "_").toUpperCase(Locale.US);
    }

    public static <T extends Comparavel> int buscaBinaria(List<T> lista, String identificador) {
        int inicio = 0;
        int fim = lista.size() - 1;
        int meio;
        int comparacao;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            System.out.println("id: " + identificador);
            System.out.println("idAtual:" + lista.get(meio).getIdentificador());
            comparacao = lista.get(meio).getIdentificador().compareTo(identificador);
            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
