package io;

import br.com.classes.Item;
import br.com.classes.Mapa;
import br.com.io.CrudGenerico;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;

public class CRUDTest {
    private final CrudGenerico<Item> itemCRUD = new CrudGenerico<>(new TypeToken<>(){}, CrudGenerico.ITENS);

    @Test
    public void salvar() {
        Item espada = new Item("SILVER_SWORD_2", "Espada de prata",
                "Uma espada brilhante de prata. Ideal para caçar monstros",  10,
                Item.TIPO.ARMA, false);

        System.out.println(itemCRUD.salvar(espada));
    }
    @Test
    public void editar() {
        Item espada = new Item("SILVER_SWORD_1", "Espada de pratânia",
                "Uma espada brilhante de pratinha. Ideal", 22, 
                Item.TIPO.ARMA, false);

        System.out.println(itemCRUD.editar("SILVER_SWORD_2", espada));
        System.out.println(itemCRUD.editar("SILVER_SWORD_4", espada));
    }

    @Test
    public void deletar() {
        System.out.println(itemCRUD.deletar("SILVER_SWORD_2"));
        System.out.println(itemCRUD.deletar("SILVER_SWORD_5"));
    }

    @Test
    public void obter() {
        System.out.println(itemCRUD.obter("SILVER_SWORD_1"));
    }

    //salvarGeneric() testa o método salvar() da classe GenericCRUD com o genérico sendo um Item
    @Test
    public void salvarGeneric() {
        TypeToken<ArrayList<Item>> tipoLista = new TypeToken<>() {};
        Item espada = new Item("SILVER_SWORD_48", "Espada de pratilda",
                "Uma espada brilhante de prata. Ideal para caçar monstros",  10,
                Item.TIPO.ARMA, false);

        System.out.println(new CrudGenerico<>(tipoLista, CrudGenerico.ITENS).salvar(espada));
    }

    //editarGeneric() testa o método editar() da classe GenericCRUD com o genérico sendo um Item
    @Test
    public void editarGeneric() {
        TypeToken<ArrayList<Item>> tipoLista = new TypeToken<>() {};
        Item espada = new Item("SILVER_SWORD_48", "Espada de patilda",
                "Uma espada brilhante de prata. Ideal para caçar monstros",  10,
                Item.TIPO.ARMA, false);

        System.out.println(new CrudGenerico<>(tipoLista, CrudGenerico.ITENS).editar("SILVER_SWORD_48", espada));
    }

    //deletarGeneric() testa o método deletar() da classe GenericCRUD com o genérico sendo um Item
    @Test
    public void deletarGeneric() {
        TypeToken<ArrayList<Item>> tipoLista = new TypeToken<>() {};
        System.out.println(new CrudGenerico<>(tipoLista, CrudGenerico.ITENS).deletar("SILVER_SWORD_48"));
    }

    //obterGeneric() testa o método obter() da classe GenericCRUD com o genérico sendo um Item
    @Test
    public void obterGeneric() {
        TypeToken<ArrayList<Item>> tipoLista = new TypeToken<>() {};
        System.out.println(new CrudGenerico<>(tipoLista, CrudGenerico.ITENS).obter("SILVER_SWORD_48"));
    }

    //obterTodosGeneric() testa o método obterTodos() da classe GenericCRUD com o genérico sendo um Item
    @Test
    public void obterTodosGeneric() {
        TypeToken<ArrayList<Item>> tipoLista = new TypeToken<>() {};
        System.out.println(new CrudGenerico<>(tipoLista, CrudGenerico.ITENS).obterTodos());
    }

    //salvarGeneric2() testa o método salvar() da classe GenericCRUD com o genérico sendo um Mapa
    @Test
    public void salvarGeneric2() {
        TypeToken<ArrayList<Mapa>> tipoLista = new TypeToken<>() {};
        Mapa mapa = new Mapa("src/br/com/data/mapas/Tautologia_teis.png", "Tautologia teis",
                "Um mapa que mostra o caminho para a tautologia teis");
        System.out.println(new CrudGenerico<>(tipoLista, CrudGenerico.MAPAS).salvar(mapa));
    }
}
