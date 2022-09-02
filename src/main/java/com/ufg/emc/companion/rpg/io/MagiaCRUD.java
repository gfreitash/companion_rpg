package com.ufg.emc.companion.rpg.io;

import com.ufg.emc.companion.rpg.classes.Magia;

import java.util.List;

public class MagiaCRUD extends CRUD<Magia> {

    @Override
    public boolean salvar(Magia magia) {
        return false;
    }

    @Override
    public boolean editar(String identificador, Magia magia) {
        return false;
    }

    @Override
    public Magia obter(String identificador) {
        return null;
    }

    @Override
    public boolean deletar(String identificador) {
        return false;
    }

    @Override
    List<Magia> obterTodos() {
        return null;
    }
}
