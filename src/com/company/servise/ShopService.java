package com.company.servise;

import com.company.entity.Item;

public interface ShopService {
    boolean addNewItem(Item item);
    boolean removeItemByName(String name);
    Item[] getListOfTheItems();
    Item getItemByName(String name);
}
