package br.com.interfaces;

import com.google.gson.Gson;

import java.util.List;

public interface CRUD<T> {
    boolean salvar(T t);
    boolean editar(String id, T t);
    T obter(String id);
    boolean deletar(String id);
    List<T> obterTodos();
}
