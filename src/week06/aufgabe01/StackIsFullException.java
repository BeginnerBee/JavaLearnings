package week06.aufgabe01;

public class StackIsFullException extends Exception {
    public StackIsFullException() {
        super("\n\tThere is no enough space");
    }
}
