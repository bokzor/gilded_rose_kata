package com.gildedrose.items;

public class BackStagePass extends BasicItem {
    public static final String name = "Backstage passes to a TAFKAL80ETC concert";

    public BackStagePass(int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (this.sellIn <= 5) {
            increaseQuality();
            increaseQuality();
            increaseQuality();
        } else if (this.sellIn <= 10) {
            increaseQuality();
            increaseQuality();
        } else {
            this.increaseQuality();
        }

        if (this.sellIn == 0) {
            this.quality = 0;
        }

        decreaseSellIn();
    }

}

