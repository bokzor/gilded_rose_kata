package com.gildedrose.items;

public class Conjured  extends BasicItem {
    public static final String name = "Conjured Mana Cake";

    public Conjured(int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.decreaseQuality();
        this.decreaseQuality();
        decreaseSellIn();
    }
}
