package br.com.io;

import br.com.classes.Mapa;
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

public class MapaCRUD implements CRUD<Mapa> {
    private final String localizacaoArquivo;
    private Gson gson;

    public static final String MAPAS = "src/br/com/data/mapas.json";

    public MapaCRUD(String localizacaoArquivo) {
        this.localizacaoArquivo = localizacaoArquivo;
        gson = new GsonBuilder().setPrettyPrinting().create();
    }


    @Override
    public boolean salvar(Mapa mapa) {
        List<Mapa> mapas = obterListaJSON();
        int busca = Collections.binarySearch(mapas, new Mapa(mapa.getIdentificador()));

        if(busca >= 0) {
            return false;
        }
        mapas.add(mapa);
        Collections.sort(mapas);

        return salvarListaJSON(mapas);
    }

    @Override
    public boolean editar(String id, Mapa mapa) {
        List<Mapa> itens = obterListaJSON();
        int busca = Collections.binarySearch(itens, new Mapa(id));

        if(busca >= 0) {
            Mapa edicao = (Mapa) mapa.editarObjeto(id);
            itens.remove(busca);
            itens.add(busca, edicao);

            return salvarListaJSON(itens);
        }
        return false;
    }

    @Override
    public Mapa obter(String id) {
        List<Mapa> mapas = obterListaJSON();
        int busca = Collections.binarySearch(mapas, new Mapa(id));
        if(busca >= 0) {
            return mapas.get(busca);
        }

       return null;
    }

    @Override
    public boolean deletar(String id) {
        List<Mapa> mapas = obterListaJSON();
        int busca = Collections.binarySearch(mapas, new Mapa(id));

        if(busca >= 0) {
            mapas.remove(busca);
            return salvarListaJSON(mapas);
        }

        return false;
    }

    @Override
    public List<Mapa> obterTodos() {
        return obterListaJSON();
    }

    private List<Mapa> obterListaJSON() {
        List<Mapa> itens;

        try (FileReader leitor = new FileReader(localizacaoArquivo)) {
            itens = new ArrayList<>(
                    Arrays.asList(gson.fromJson(leitor, Mapa[].class))
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return itens;
    }

    private boolean salvarListaJSON(List<Mapa> Mapa){
        try(FileWriter escritor = new FileWriter(localizacaoArquivo)) {
            escritor.write(gson.toJson(Mapa));
            escritor.flush();
        }  catch (IOException e) {
            return false;
        }

        return true;
    }
}