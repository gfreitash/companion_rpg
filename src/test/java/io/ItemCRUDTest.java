package io;

import com.ufg.emc.companion.rpg.classes.Item;
import com.ufg.emc.companion.rpg.io.ItemCRUD;
import org.junit.jupiter.api.Test;

public class ItemCRUDTest {
    private final ItemCRUD itemCRUD = new ItemCRUD("src/main/java/data/itens.json");

    @Test
    void salvar() {
        Item espada = new Item(10, "Espada de prata",
                "Uma espada brilhante de prata. Ideal para caçar monstros",
                Item.TIPO.ARMA, false);

        itemCRUD.salvar(espada);
    }

}
