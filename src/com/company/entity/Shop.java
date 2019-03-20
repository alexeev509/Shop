package com.company.entity;

import java.util.Arrays;

public class Shop {
    private Address address;
    private String nameOfTheShop;
    private double countOfMoney;
    private int countOfItems;

    private Item[] items;

    private int size;

    public Shop(Address address, String nameOfTheShop, double countOfMoney, int countOfItems) {
        this.address = address;
        this.nameOfTheShop = nameOfTheShop;
        this.countOfMoney = countOfMoney;
        this.countOfItems = countOfItems;
        items=new Item[countOfItems];
        size=0;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNameOfTheShop() {
        return nameOfTheShop;
    }

    public void setNameOfTheShop(String nameOfTheShop) {
        this.nameOfTheShop = nameOfTheShop;
    }

    public double getCountOfMoney() {
        return countOfMoney;
    }

    public void setCountOfMoney(double countOfMoney) {
        this.countOfMoney = countOfMoney;
    }

    public int getCountOfItems() {
        return countOfItems;
    }

    public void setCountOfItems(int countOfItems) {
        this.countOfItems = countOfItems;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "address=" + address.toString() +
                ", nameOfTheShop='" + nameOfTheShop + '\'' +
                ", countOfMoney=" + countOfMoney +
                ", countOfItems=" + countOfItems +
                ", items=" + Arrays.toString(items) +
                ", size=" + size +
                '}';
    }
}
