package es.rutenioh;

import java.util.List;

public class Inn {

    private List<Item> items;

    public Inn(List<Item> items) {
        this.items = items;
    }


    public List<Item> update() {
        for (Item item: items) {
            item.setQualityValue(item.getQualityValue() - 1);
            item.setSellInValue(item.getSellInValue() - 1);
        }
        return items;
    }
}
