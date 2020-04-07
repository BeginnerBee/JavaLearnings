package week04.aufgaben;

import java.util.List;

public class BundleItem extends Item {

    private int discount;
    private List<Item> items;

    public BundleItem(String label, List<Item> items, int discount) {
        super(label);
        this.items = items;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total - total * discount / 100;
    }

    @Override
    public void print() {
        System.out.print("\t\t---------------------\n");
        for (Item item : items) {
            System.out.print("\t\t");
            item.print();
        }
        System.out.println(getPrice() + " <-- " + discount + "% " + getDescription());
    }
}
