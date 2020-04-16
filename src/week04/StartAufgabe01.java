package week04;

import java.util.ArrayList;
import java.util.List;

public class StartAufgabe01 {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new ProductItem("Milk", 1.80, 5));
        items.add(new ProductItem("Hanuta", 2.9, 2));
        items.add(new ServiceItem("Delivery", 2));
        items.add(new ProductItem("Baklava", 4, 1));
        items.add(new ProductItem("Yogurt", 1, 3));
        items.add(new ServiceItem("Packaging", 3));

        Order myOrder = new Order(items);
        myOrder.printItems();
        System.out.println("---------------------------");
        System.out.println(myOrder.getTotalPrice() + " Totally");

    }

}
