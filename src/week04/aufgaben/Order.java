package week04.aufgaben;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printItems() {
        items.forEach((Item s)->s.print());
    }

}
