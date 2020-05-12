package com.gildedrose;

import com.gildedrose.items.BasicItem;

import java.util.Arrays;

class GildedRose {

    BasicItem[] items;

    public GildedRose(Item[] items) {
        this.items = Arrays.stream(items).map(CustomItemFactory::createItem).toArray(BasicItem[]::new);
    }

    public void updateQuality() {
        for (BasicItem item: items) {
            item.updateQuality();
        }
    }
}