package com.ufg.emc.companion.rpg.io;

import com.google.gson.Gson;
import com.ufg.emc.companion.rpg.classes.Item;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ItemCRUD extends CRUD<Item> {
    private Gson gson;
    private String localizacaoArquivo;

    public ItemCRUD(String localizacaoArquivo) {
        this.localizacaoArquivo = localizacaoArquivo;
        gson = new Gson();
    }

    @Override
    public boolean salvar(Item item) {
        var itemJSON = gson.toJson(item);
        System.out.println(itemJSON);

        String arquivoJSON;
        try(FileReader fr = new FileReader(localizacaoArquivo)) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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

    @Override
    public List<Item> obterTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
