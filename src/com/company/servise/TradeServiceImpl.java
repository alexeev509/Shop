package com.company.servise;

import com.company.entity.Client;
import com.company.entity.Item;
import com.company.entity.Shop;

public class TradeServiceImpl implements TradeService {
    private Client client;
    private Shop shop;

    public TradeServiceImpl(Client client, Shop shop) {
        this.client = client;
        this.shop = shop;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public boolean buyItemByName(String name) {
        Item currentItem=null;
        Item[] items = shop.getItems();
        int i=0;
        for (; i < items.length; i++) {
            if(items[i].getNameOfTheItem().equals(name)) {
                currentItem = items[i];
                break;
            }

        }
        if(currentItem==null) {
            System.out.println("we dont have item with your name");
            return false;
        }
        if(currentItem.getPrice()>client.getMoneyOnTheCard()){
            System.out.println("you dont have enough money for transaction");
            return false;
        }
        client.setMoneyOnTheCard(client.getMoneyOnTheCard()-currentItem.getPrice());
        items[i].setCountOfItems(items[i].getCountOfItems()-1);
        return true;
    }
}
