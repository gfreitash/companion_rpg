package io;

import br.com.classes.Item;
import br.com.io.ItemCRUD;
import org.junit.Test;

public class CRUDTest {
    private final ItemCRUD itemCRUD = new ItemCRUD("src/br/com/data/itens.json");

    @Test
    public void salvar() {
        Item espada = new Item("SILVER_SWORD_2", 10, "Espada de prata",
                "Uma espada brilhante de prata. Ideal para caçar monstros",
                Item.TIPO.ARMA, false);

        System.out.println(itemCRUD.salvar(espada));
    }
    @Test
    public void editar() {
        Item espada = new Item("SILVER_SWORD_1", 22, "Espada de pratânia",
                "Uma espada brilhante de pratinha. Ideal",
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
}
