package com.gildedrose.items;

public class AgedBrie extends BasicItem {
    public static final String name = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if(sellIn == 0) {
            this.increaseQuality();
            this.increaseQuality();
        } else {
            this.increaseQuality();
        }
        this.decreaseSellIn();
    }

}

