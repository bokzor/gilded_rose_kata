package com.gildedrose.items;

import com.gildedrose.Item;

public class BasicItem extends Item {

    private final static int minQualityValue = 0;
    private final static int maxQualityValue = 50;

    public BasicItem(String name, int sellIn, int quality) {
        super(name, Math.max(sellIn, 0), quality);
    }

    protected boolean isAboveMinimumQualityValue() {
        return this.quality > minQualityValue;
    }

    protected boolean isUnderHighestQualityValue() {
        return this.quality < maxQualityValue;
    }

    public void updateQuality() {
        if (this.sellIn == 0) {
            this.decreaseQuality();
            this.decreaseQuality();
        } else {
            this.decreaseQuality();
        }
        this.decreaseSellIn();
    }

    protected void increaseQuality() {
        if (this.isUnderHighestQualityValue()) {
            quality++;
        }
    }

    protected void decreaseQuality() {
        if (this.isAboveMinimumQualityValue()) {
            quality--;
        }
    }

    protected void decreaseSellIn() {
        sellIn--;
    }


}
