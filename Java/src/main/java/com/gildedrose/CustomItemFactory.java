package com.gildedrose;

import com.gildedrose.items.*;

public class CustomItemFactory {
    public static BasicItem createItem(Item item) {
        if (item.name.equals(AgedBrie.name)) {
            return new AgedBrie(item.sellIn, item.quality);
        }

        if (item.name.equals(BackStagePass.name)) {
            return new BackStagePass(item.sellIn, item.quality);
        }

        if (item.name.equals(Sulfuras.name)) {
            return new Sulfuras(item.sellIn);
        }

        if (item.name.equals(Conjured.name)) {
            return new Conjured(item.sellIn, item.quality);
        }

        return new BasicItem(item.name, item.sellIn, item.quality);
    }
}
