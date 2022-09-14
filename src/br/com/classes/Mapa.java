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
    private String endereco;
    private String nome;

    public Mapa(String endereco, String nome) {
        super(nome);
        this.endereco = endereco;
        this.nome = nome;
    }

    public Mapa(String endereco, String nome, String identificador) {
        super(identificador);
        this.endereco = endereco;
        this.nome = nome;
    } 
    
    public Mapa(String id){
        super(id);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.endereco);
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
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return "Mapa{" + "endere\u00e7o=" + endereco + ", nome=" + nome + '}';
    }

    @Override
    public Comparavel getModelo(String id) {
        return new Mapa(id);
    }

    @Override
    public Comparavel editarObjeto(String id) {
        return new Mapa(this.endereco, this.nome, id);
    }  

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
