package week05.aufgaben.aufgabe01;


/*
Then design a new Drawing class that takes an array of shapes (developed in Task 1) and lets you draw each shape by
calling the draw () method. The following methods are to be implemented:
*/
public class Drawing {

    private Shape[] shapes;
    private static Visualization v = new Visualization();

    public Drawing(Shape[] shapes) {
        this.shapes = shapes;
    }

    /* Draw all the figures that were passed to the constructor by calling the draw () method on Shape. */
    public void draw() {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw(v);
        }
    }

    /* Move all figures around deltaX on the x-axis and deltaY on the y-axis */
    public void move(int deltaX, int deltaY) {
        v.clear();
        for (Shape s : shapes) {
            s.move(deltaX, deltaY).draw(v);
        }

    }

    /* Write all text of the characters on the console (i.e., if the characters implement the text interface) */
    void printTexts() {
        for (Shape s : shapes) {
            if (s instanceof Text) {
                TextBox t = (TextBox) s;
                v.drawText(t.getX(), t.getY(), t.getText(), t.getTextColor());
            }
        }
    }
}
