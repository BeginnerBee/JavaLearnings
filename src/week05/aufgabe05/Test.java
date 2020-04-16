package week05.aufgabe05;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // Sample shows how to directly draw on the visualization board.
        Rectangle rect = new Rectangle(new Point(10, 10), new Size(100, 80), NiceColors.BLUE.getValue());
        Circle circle = new Circle(new Point(130, 60), 40, NiceColors.RED.getValue());
        TextBox textBox = new TextBox(new Point(120, 110),new Size( 100, 50), NiceColors.GREEN.getValue(), "Hello!", NiceColors.BLACK.getValue());
        Shape[] figures = { rect, circle, textBox };
        Drawing drawing = new Drawing(figures);
        drawing.draw();
        TimeUnit.SECONDS.sleep(2);
        drawing.move(new Point(100, 100));
        drawing.draw();
        drawing.printTexts();
    }
}
