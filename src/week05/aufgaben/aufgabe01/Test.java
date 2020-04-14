package week05.aufgaben.aufgabe01;

import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		// Sample shows how to directly draw on the visualization board.
		// TODO: Replace this code by using instances of the Shape interface.
		Shape[] shapes = {
			new Circle(300,200,100,348840),
			new Rectangle(500,200,100,100, 348840),
			new TextBox(700, 200, 100, 100, 0x9bbb59, "Hello!", 0x000000)
		};

		Drawing drawing = new Drawing(shapes);
		drawing.draw();
		TimeUnit.SECONDS.sleep(2);
		drawing.move(0,300);
	}
}
