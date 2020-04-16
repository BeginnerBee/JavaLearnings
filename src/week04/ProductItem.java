package week04;

public class ProductItem extends Item {

    private double pricePerUnit;
    private int amount;

    public ProductItem(String desc, double p, int amount) {
        super(desc);
        pricePerUnit = p;
        this.amount = amount;
    }

    @Override
    public double getPrice() {
        return pricePerUnit * amount;
    }

    @Override
    public void print() {
        System.out.println(getPrice() + " --> (" + pricePerUnit + " * " + amount + ") " + getDescription() );
    }
}
