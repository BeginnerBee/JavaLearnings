package week05.aufgabe05;


import java.awt.*;

/*
Then design a new Drawing class that takes an array of shapes (developed in Task 1) and lets you draw each shape by
calling the draw () method. The following methods are to be implemented:
*/
public class Drawing {

    private Shape[] shapes;
    public static Visualization v = new Visualization();

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
    public void move(Point deltaPoint) {
        v.clear();
        for (Shape s : shapes) {
            s.move(deltaPoint);
            s.draw(v);
        }

    }

    /* Write all text of the characters on the console (i.e., if the characters implement the text interface) */
    void printTexts() {
        for (Shape s : shapes) {
            if (s instanceof Text) {
                TextBox t = (TextBox) s;
                v.drawText(t.getPoint().x, t.getPoint().y, t.getText(), t.getTextColor());
            }
        }
    }

    void moveCenter() {
        v.clear();
        for (Shape s : shapes) {
            s.moveToCenter(s, v);
        }
    }

    void isCenter(){
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + ": " + s.isInCenter());
        }
    }

    void getColor(){
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + ": " + s.getColor(s));
        }
    }

}
