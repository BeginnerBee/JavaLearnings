package week05.aufgaben.aufgabe03;

import java.awt.*;
import java.util.concurrent.*;
import java.util.stream.IntStream;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        // Sample shows how to directly draw on the visualization board.
        Shape[] shapes = {
                new Rectangle(new Point(0, 200), new Size(250, 150), NiceColors.RED.getValue()),
                new TextBox(new Point(500, 200), new Size(200, 150), NiceColors.ORANGE.getValue(), "Hello!", NiceColors.BLACK.getValue()),
                new Circle(new Point(300, 200), 150, NiceColors.WHITE.getValue()),
        };

        Drawing drawing = new Drawing(shapes);
        drawing.draw();
        TimeUnit.SECONDS.sleep(2);
        drawing.move(new Point(200, 200));
        TimeUnit.SECONDS.sleep(2);
        drawing.moveCenter();
        drawing.isCenter();
        drawing.getColor();
    }


}

