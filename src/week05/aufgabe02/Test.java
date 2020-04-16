package week05.aufgabe02;

import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		// Sample shows how to directly draw on the visualization board.
		Rectangle rect = new Rectangle(10, 10, 100, 80, 0x1f497d);
		Circle circle = new Circle(130, 60, 40, 0xc0504d);
		TextBox textBox = new TextBox(120, 110, 100, 50, 0x9bbb59, "Hello!", 0x000000);
		Shape[] figures = { rect, circle, textBox };
		Drawing drawing = new Drawing(figures);
		drawing.draw();
		TimeUnit.SECONDS.sleep(2);
		drawing.move(100, 100);
		drawing.draw();
		drawing.printTexts();
	}
}
