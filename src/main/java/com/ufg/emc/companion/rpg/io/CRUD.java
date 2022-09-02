package com.ufg.emc.companion.rpg.io;

public interface CRUD<T> {
    boolean salvar(T t);
    boolean editar(String identificador, T t);
    T obter(String identificador);
    boolean deletar(String identificador);

}
