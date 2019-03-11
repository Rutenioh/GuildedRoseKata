package es.rutenioh;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GuildedRoseTest {



    @Test
    public void deberiaCalcularCalidadDespuesDeUnDia() {
        int dias = 1;
        Item item = new Item("Bastard Sword", 10, 20);
        List<Item> items = new ArrayList<>();
        items.add(item);

        Inn inn = new Inn (items);
        List<Item> updatedItems = inn.update();

        for (Item updatedItem: updatedItems) {
            assertEquals(updatedItem.getQualityValue(), 20 - dias);
            assertEquals(updatedItem.getSellInValue(), 10 - dias);
        }

    }


}
