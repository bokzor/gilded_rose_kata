package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void once_sell_date_passed_quality_degrades_twice_as_fast() {
        Item[] items = new Item[] {
                new Item("sell_date_passed", 0, 10),
                new Item("sell_date_not_passed", 2, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
        assertEquals(9, app.items[1].quality);
    }


    @Test
    void quality_of_item_is_never_negative() {
        Item[] items = new Item[] {
                new Item("sell_date_passed", 0, 0),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void aged_brie_increases_in_quality() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 1, 0),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }

    @Test
    void aged_brie_with_passed_date_increases_in_quality_twice_as_fast() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 0, 0),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void quality_of_items_is_never_more_50() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 0, 50),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void sulfuras_should_not_decrease_quality_nor_be_sell() {
        Item[] items = new Item[] {
                new Item("Sulfuras, Hand of Ragnaros", 10, 25),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(25, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
    }

    @Test
    void backstage_passes_should_increase_quality_by2_when_10_days_or_less() {
        Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 25),
                new Item("Backstage passes to a TAFKAL80ETC concert", 9, 25),
                new Item("Backstage passes to a TAFKAL80ETC concert", 11, 25),
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(27, app.items[0].quality);
        assertEquals(27, app.items[1].quality);
        assertEquals(26, app.items[2].quality);
    }

    @Test
    void backstage_passes_should_increase_quality_by3_when_5_days_or_less() {
        Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 25),
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 25),
                new Item("Backstage passes to a TAFKAL80ETC concert", 11, 25),
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(28, app.items[0].quality);
        assertEquals(28, app.items[1].quality);
        assertEquals(26, app.items[2].quality);
    }


    @Test
    void backstage_passes_quality_should_dtop_to_zero_after_concert() {
        Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 25),
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
}
