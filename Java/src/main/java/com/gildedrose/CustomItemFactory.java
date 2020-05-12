package com.gildedrose;

import com.gildedrose.items.AgedBrie;
import com.gildedrose.items.BackStagePass;
import com.gildedrose.items.BasicItem;
import com.gildedrose.items.Sulfuras;

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

        return new BasicItem(item.name, item.sellIn, item.quality);
    }
}
