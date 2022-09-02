package com.ufg.emc.companion.rpg.io;

import com.ufg.emc.companion.rpg.classes.Item;

public class ItemCRUD implements CRUD<Item> {
    @Override
    public boolean salvar(Item item) {
        return false;
    }

    @Override
    public boolean editar(String identificador, Item item) {
        return false;
    }

    @Override
    public Item obter(String identificador) {
        return null;
    }

    @Override
    public boolean deletar(String identificador) {
        return false;
    }
}
