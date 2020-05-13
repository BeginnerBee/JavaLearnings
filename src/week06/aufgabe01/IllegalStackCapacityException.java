package week06.aufgabe01;

public class IllegalStackCapacityException extends Exception {

    public IllegalStackCapacityException(int i) {
        super("\n\tExpected value range: capacity > 0 and capacity <= 65536. " +
                "The value was entered: " + i + "\n\tDefault capacity of stack: 10");
    }
}
