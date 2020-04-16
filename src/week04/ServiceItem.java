package week04;

public class ServiceItem extends Item {

    private double price;

    public ServiceItem(String description, double price) {
        super(description);
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(price + " --> " + getDescription());
    }

    @Override
    public double getPrice() {
        return price;
    }

}
