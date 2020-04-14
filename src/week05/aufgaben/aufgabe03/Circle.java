package week05.aufgaben.aufgabe03;

import java.awt.*;

public class Circle implements Shape {
    private Point point;
    private int radius;
    private int color;

    public Circle(Point point, int radius, int color) {
        this.point = point;
        this.radius = radius;
        this.color = color;
    }



    /*Returns the radius of the circle*/
    public int getRadius() {
        /*The center of the circle is defined by getX () / getY ()*/
        return point.x / point.y;
    }

    @Override
    public int getAreaColor() {
        return color;
    }

    @Override
    public void draw(Visualization v) {
        v.drawCircle(point.x, point.y, radius, color);
    }


    @Override
    public Shape move(Point p) {
        point.x = p.x;
        point.y = p.y;
        return this;
    }

    @Override
    public Point getPoint() {
        return point;
    }

}
