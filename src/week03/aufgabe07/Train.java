package week03.aufgabe07;

import java.util.ArrayList;
import java.util.Collections;

public class Train {

    private Locomotive locomotive;
    private ArrayList<Car> cars;

    public Train(Locomotive locomotive, ArrayList<Car> cars) {
        this.locomotive = locomotive;
        this.cars = cars;
    }

    public void add(String name) {
        this.cars.add(new Car(name));
    }

    public int nofCars() {
        return this.cars.size();
    }

    public String getCarName(int position) {
        return this.cars.get(position -1).getName();
    }

    public void insert(int position, String name) {
        this.cars.add(position -1, new Car(name));
    }

    public Car removeFirst() {
        return this.cars.remove(0);
    }

    public void revert() {
        Collections.reverse(this.cars);
    }

}
