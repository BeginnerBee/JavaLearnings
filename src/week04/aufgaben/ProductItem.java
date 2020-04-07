package week04.aufgaben;

public class ProductItem extends Item {

    private double pricePerUnit;
    private int amount;

    public ProductItem(String desc, double pricePerUnit, int amount) {
        super(desc);
        this.pricePerUnit = pricePerUnit;
        this.amount = amount;
    }

    @Override
    public double getPrice() {
        return pricePerUnit * amount;
    }

    @Override
    public void print() {
        System.out.println(getPrice() + " --> (" + pricePerUnit + " * " + amount + ") " + getDescription());
    }

}
