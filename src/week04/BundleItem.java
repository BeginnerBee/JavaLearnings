package week04;

import java.util.List;

public class BundleItem extends Item {

    public int discount;
    public List<Item> items;

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
    }

}
