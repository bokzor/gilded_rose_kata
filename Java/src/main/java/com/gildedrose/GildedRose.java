package com.gildedrose;

import com.gildedrose.items.BasicItem;

import java.util.Arrays;

class GildedRose {
    private final static int minQualityValue = 0;
    private final static int maxQualityValue = 50;

    BasicItem[] items;

    public GildedRose(Item[] items) {
        this.items = Arrays.stream(items).map(CustomItemFactory::createItem).toArray(BasicItem[]::new);
    }

    public void updateQuality() {
        for (BasicItem item: items) {
            item.updateQuality();
        }
    }

    private boolean isAboveMinimumQualityValue(Item item) {
        return item.quality > minQualityValue;
    }

    private boolean isUnderHighestQualityValue(Item item) {
        return item.quality < maxQualityValue;

    }
}