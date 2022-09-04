package br.com.io;

import br.com.classes.Item;
import br.com.interfaces.CRUD;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemCRUD implements CRUD<Item> {
    private final String localizacaoArquivo;
    private Gson gson;
    
    public static final String ITENS = "src/br/com/data/itens.json";

    public ItemCRUD(String localizacaoArquivo) {
        this.localizacaoArquivo = localizacaoArquivo;
        gson = new GsonBuilder().setPrettyPrinting().create();
    }


    @Override
    public boolean salvar(Item item) {
        List<Item> itens = obterListaJSON();
        int busca = Collections.binarySearch(itens, new Item(item.getIdentificador()));

        if(busca >= 0) {
            return false;
        }
        itens.add(item);
        Collections.sort(itens);

        return salvarListaJSON(itens);
    }

    @Override
    public boolean editar(String id, Item item) {
        List<Item> itens = obterListaJSON();
        int busca = Collections.binarySearch(itens, new Item(id));

        if(busca >= 0) {
            Item edicao = (Item) item.editarObjeto(id);
            itens.remove(busca);
            itens.add(busca, edicao);

            return salvarListaJSON(itens);
        }
        return false;
    }

    @Override
    public Item obter(String id) {
        List<Item> itens = obterListaJSON();
        int busca = Collections.binarySearch(itens, new Item(id));

        if(busca >= 0) {
            return itens.get(busca);
        }

        return null;
    }

    @Override
    public boolean deletar(String id) {
        List<Item> itens = obterListaJSON();
        int busca = Collections.binarySearch(itens, new Item(id));

        if(busca >= 0) {
            itens.remove(busca);
            return salvarListaJSON(itens);
        }

        return false;
    }

    @Override
    public List<Item> obterTodos() {
        return obterListaJSON();
    }

    private List<Item> obterListaJSON() {
        List<Item> itens;

        try (FileReader leitor = new FileReader(localizacaoArquivo)) {
            itens = new ArrayList<Item>(
                    Arrays.asList(gson.fromJson(leitor, Item[].class))
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return itens;
    }

    private boolean salvarListaJSON(List<Item> itens){
        try(FileWriter escritor = new FileWriter(localizacaoArquivo)) {
            escritor.write(gson.toJson(itens));
            escritor.flush();
        }  catch (IOException e) {
            return false;
        }

        return true;
    }
}