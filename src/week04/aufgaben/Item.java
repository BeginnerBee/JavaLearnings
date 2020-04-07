package week04.aufgaben;

public abstract class Item {

    private String description;

    public Item(String description) {
        this.description = description;
    }

    abstract double getPrice();
    abstract void print();

    public String getDescription() {
        return description;
    }
}
