/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;
import br.com.interfaces.Comparavel;
import java.util.Objects;

/**
 *
 * @author Thiago
 */
public class Mapa extends Comparavel{
    private String endereço;
    private String nome;

    public Mapa(String endereço, String nome) {
        super(nome);
        this.endereço = endereço;
        this.nome = nome;
    }

    public Mapa(String endereço, String nome, String identificador) {
        super(identificador);
        this.endereço = endereço;
        this.nome = nome;
    } 
    
    public Mapa(String id){
        super(id);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.endereço);
        hash = 37 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mapa other = (Mapa) obj;
        if (!Objects.equals(this.endereço, other.endereço)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return "Mapa{" + "endere\u00e7o=" + endereço + ", nome=" + nome + '}';
    }

    @Override
    public Comparavel getModelo(String id) {
        return new Mapa(id);
    }

    @Override
    public Comparavel editarObjeto(String id) {
        return new Mapa(this.endereço, this.nome, id);        
    }  

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
