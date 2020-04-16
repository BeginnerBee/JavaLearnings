package week04;

import java.util.ArrayList;
import java.util.List;

public class StartAufgabe02 {

    public static void main(String[] args) {

        List<Item> itemsForBundle1 = new ArrayList<>();
        itemsForBundle1.add(new ProductItem("H", 2, 3));
        itemsForBundle1.add(new ProductItem("I", 2, 4));
        itemsForBundle1.add(new ServiceItem("J", 3));
        itemsForBundle1.add(new ServiceItem("K", 3));

        List<Item> itemsForBundle2 = new ArrayList<>();
        itemsForBundle2.add(new ProductItem("D", 4, 1));
        itemsForBundle2.add(new ProductItem("E", 1, 3));
        itemsForBundle2.add(new ServiceItem("F", 3));
        itemsForBundle2.add(new BundleItem("GG", itemsForBundle1, 10));

        List<Item> items = new ArrayList<>();
        items.add(new ProductItem("A", 1.80, 5));
        items.add(new ProductItem("B", 2.9, 2));
        items.add(new ServiceItem("C", 2));
        items.add(new BundleItem("LL", itemsForBundle2, 20));

        Order myOrder = new Order(items);
        myOrder.printItems();
        System.out.println("++++++");
        //System.out.println(myOrder.getTotalPrice() + " Totally");

    }
}
