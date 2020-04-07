package week04.aufgaben;

import java.util.ArrayList;
import java.util.List;

public class StartAufgabe02 {

    public static void main(String[] args) {

        List<Item> itemsForBundle1 = new ArrayList<>();
        itemsForBundle1.add(new ProductItem("Bisküvi", 2, 3));
        itemsForBundle1.add(new ProductItem("Peynir", 2, 4));
        itemsForBundle1.add(new ServiceItem("Packaging", 3));
        itemsForBundle1.add(new ServiceItem("Packaging", 3));

        List<Item> itemsForBundle2 = new ArrayList<>();
        itemsForBundle2.add(new ProductItem("Baklava", 4, 1));
        itemsForBundle2.add(new ProductItem("Yogurt", 1, 3));
        itemsForBundle2.add(new ServiceItem("Packaging", 3));

        List<Item> items = new ArrayList<>();
        items.add(new ProductItem("Milk", 1.80, 5));
        items.add(new ProductItem("Hanuta", 2.9, 2));
        items.add(new ServiceItem("Delivery", 2));
        items.add(new BundleItem("Special Discount", itemsForBundle2, 20));
        items.add(new BundleItem("Deneme Discount", itemsForBundle1, 10));

        Order myOrder = new Order(items);
        myOrder.printItems();
        System.out.println("++++++");
        System.out.println(myOrder.getTotalPrice() + " Totally");

        Item[] a = {
                new ProductItem("Milk", 1.80, 5),
                new ProductItem("Milk", 1.80, 5),
                new ProductItem("Milk", 1.80, 5),
                new ServiceItem("Delivery", 2)
        };

    }
}
