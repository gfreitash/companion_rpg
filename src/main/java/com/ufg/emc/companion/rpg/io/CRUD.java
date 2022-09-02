package com.ufg.emc.companion.rpg.io;

import com.google.gson.Gson;

import java.util.List;

public abstract class CRUD<T> {

    abstract boolean salvar(T t);
    abstract boolean editar(String identificador, T t);
    abstract T obter(String identificador);
    abstract boolean deletar(String identificador);
    abstract List<T> obterTodos();
}
