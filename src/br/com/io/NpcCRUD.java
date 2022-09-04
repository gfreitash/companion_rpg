package br.com.io;

import br.com.classes.Item;
import br.com.classes.NpcDnd;
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

public class NpcCRUD implements CRUD<NpcDnd> {
    private final String localizacaoArquivo;
    private Gson gson;

    public static final String NPCS = "src/br/com/data/npcs.json";

    public NpcCRUD(String localizacaoArquivo) {
        this.localizacaoArquivo = localizacaoArquivo;
        gson = new GsonBuilder().setPrettyPrinting().create();
    }


    @Override
    public boolean salvar(NpcDnd npc) {
        List<NpcDnd> npcs = obterListaJSON();
        int busca = Collections.binarySearch(npcs, new NpcDnd(npc.getIdentificador()));

        if(busca >= 0) {
            return false;
        }
        npcs.add(npc);
        Collections.sort(npcs);

        return salvarListaJSON(npcs);
    }

    @Override
    public boolean editar(String id, NpcDnd npc) {
        List<NpcDnd> itens = obterListaJSON();
        int busca = Collections.binarySearch(itens, new NpcDnd(id));

        if(busca >= 0) {
            NpcDnd edicao = (NpcDnd) npc.editarObjeto(id);
            itens.remove(busca);
            itens.add(busca, edicao);

            return salvarListaJSON(itens);
        }
        return false;
    }

    @Override
    public NpcDnd obter(String id) {
        List<NpcDnd> npcs = obterListaJSON();
        int busca = Collections.binarySearch(npcs, new NpcDnd(id));
        if(busca >= 0) {
            return npcs.get(busca);
        }

       return null;
    }

    @Override
    public boolean deletar(String id) {
        List<NpcDnd> npcs = obterListaJSON();
        int busca = Collections.binarySearch(npcs, new NpcDnd(id));

        if(busca >= 0) {
            npcs.remove(busca);
            return salvarListaJSON(npcs);
        }

        return false;
    }

    @Override
    public List<NpcDnd> obterTodos() {
        return obterListaJSON();
    }

    private List<NpcDnd> obterListaJSON() {
        List<NpcDnd> itens;

        try (FileReader leitor = new FileReader(localizacaoArquivo)) {
            itens = new ArrayList<NpcDnd>(
                    Arrays.asList(gson.fromJson(leitor, NpcDnd[].class))
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return itens;
    }

    private boolean salvarListaJSON(List<NpcDnd> npcs){
        try(FileWriter escritor = new FileWriter(localizacaoArquivo)) {
            escritor.write(gson.toJson(npcs));
            escritor.flush();
        }  catch (IOException e) {
            return false;
        }

        return true;
    }
}