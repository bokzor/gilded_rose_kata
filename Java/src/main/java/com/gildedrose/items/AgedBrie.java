package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends BasicItem {
    public static final String name = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void theDayHasPassed() {

    }
}
