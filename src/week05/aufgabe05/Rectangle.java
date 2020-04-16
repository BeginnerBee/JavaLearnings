package week05.aufgabe05;

//TODO: The upper left point of the rectangle is defined by getX () / getY ()

import java.awt.*;

public class Rectangle implements week05.aufgabe05.Shape {

    private Point point;
    private Size size;
    private int color;

    public Rectangle(Point point, Size size, int color) {
        this.point = point;
        this.size = size;
        this.color = color;
    }

    /*Returns the width of the rectangle*/
    public int getWidth() {
        return size.getWidth();
    }

    /*Returns the height of the rectangle*/
    public int getHeight() {
        return size.getHeight();
    }

    /*Changes width and height*/
    public void resize(Size p_size) {
        size = p_size;
    }

    @Override
    public int getAreaColor() {
        return color;
    }

    @Override
    public void draw(Visualization visualization) {
        visualization.drawRectangle(point.x, point.y, size.getWidth(), size.getHeight(), color);
    }

    @Override
    public void move(Point p) {
        point.x = p.x;
        point.y = p.y;
    }

    @Override
    public Point getPoint() {
        return point;
    }

    public Size getSize() {
        return size;
    }

}
