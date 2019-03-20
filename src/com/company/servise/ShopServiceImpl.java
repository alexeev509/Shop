package com.company.servise;

import com.company.entity.Item;
import com.company.entity.Shop;

public class ShopServiceImpl implements ShopService {
    private Shop shop;

    public ShopServiceImpl(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public boolean addNewItem(Item item) {
        int countOfItems = shop.getSize();
        Item[] items = shop.getItems();
        items[countOfItems++]=item;
        shop.setSize(countOfItems);
        return true;
    }

    @Override
    public boolean removeItemByName(String name) {
        return false;
    }

    @Override
    public Item[] getListOfTheItems() {
        return new Item[0];
    }

    @Override
    public Item getItemByName(String name) {
        return null;
    }
}
