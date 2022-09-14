package br.com.io;

import br.com.interfaces.CRUD;
import br.com.interfaces.Comparavel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Essa classe é uma implementação de CRUD. Seu objetivo será salvar qualquer
//objeto que implemente a interface Comparavel em um arquivo JSON.
//Ela funcionará de forma analoga à classe ItemCRUD e NpcCRUD, mas servirá para
//qualquer classe genérica. Utilizará o mesmo código, adaptando para o uso genérico.
public class CrudJson<T extends Comparavel> implements CRUD<T> {
    private final TypeToken<ArrayList<T>> tipoLista;
    private final String localizacaoArquivo;
    private final Gson gson;

    public static final String MAPAS = "src/br/com/data/mapas.json";
    public static final String ITENS = "src/br/com/data/itens.json";
    public static final String NPCS = "src/br/com/data/npcs.json";

    public CrudJson(TypeToken<ArrayList<T>> tipoLista, String localizacaoArquivo) {
        this.tipoLista = tipoLista;
        this.localizacaoArquivo = localizacaoArquivo;
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    @Override
    public boolean salvar(T t) {
        List<T> lista = obterListaJSON();
        int busca = T.buscaBinaria(lista, t.getIdentificador());

        if(busca >= 0) {
            return false;
        }
        lista.add(t);
        Collections.sort(lista);

        return salvarListaJSON(lista);
    }


    @Override
    public boolean editar(String id, T t) {
        List<T> lista = obterListaJSON();
        int busca = T.buscaBinaria(lista, id);

        if(busca >= 0) {
            T edicao = (T) t.editarObjeto(id);
            lista.remove(busca);
            lista.add(busca, edicao);

            return salvarListaJSON(lista);
        }
        return false;
    }

    @Override
    public T obter(String id) {
        List<T> lista = obterListaJSON();
        int busca = T.buscaBinaria(lista, id);

        if(busca >= 0) {
            return lista.get(busca);
        }
        return null;
    }

    @Override
    public boolean deletar(String id) {
        List<T> lista = obterListaJSON();
        int busca = T.buscaBinaria(lista, id);

        if(busca >= 0) {
            lista.remove(busca);
            return salvarListaJSON(lista);
        }
        return false;
    }

    @Override
    public List<T> obterTodos() {
        return obterListaJSON();
    }

    private List<T> obterListaJSON() {
        try {
            FileReader reader = new FileReader(localizacaoArquivo);
            return gson.fromJson(reader, tipoLista.getType());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private boolean salvarListaJSON(List<T> lista) {
        try {
            FileWriter writer = new FileWriter(localizacaoArquivo);
            gson.toJson(lista, writer);
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
