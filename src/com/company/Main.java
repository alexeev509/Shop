package com.company;

import com.company.entity.Address;
import com.company.entity.Client;
import com.company.entity.Item;
import com.company.entity.Shop;
import com.company.servise.ShopServiceImpl;
import com.company.servise.ShopService;
import com.company.servise.TradeService;
import com.company.servise.TradeServiceImpl;

public class Main {

    public static void main(String[] args) {
        Shop trushop=new Shop(new Address("SPB","Engelsa street",4,5),
                "Trushop",
                300_000,
                50);

        ShopService shopService=new ShopServiceImpl(trushop);

        shopService.addNewItem(new Item(2500,"Hoody Jack Jones",10));
        shopService.addNewItem(new Item(2500,"Hoody Gucci",15));

        System.out.println(trushop.toString());


        Client client =new Client(1234532,4500,"Bob","Rain","8-905-300-21-23");

        TradeService tradeService=new TradeServiceImpl(client,trushop);

        tradeService.buyItemByName("Hoody Gucci");

        System.out.println(client.toString());

    }
}
