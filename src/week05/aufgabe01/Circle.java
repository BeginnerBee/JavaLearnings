package week05.aufgabe01;

public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;
    private int color;

    public Circle(int x, int y, int radius, int color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }



    /*Returns the radius of the circle*/
    public int getRadius() {
        /*The center of the circle is defined by getX () / getY ()*/
        return getX() / getY();
    }

    @Override
    public int getAreaColor() {
        return color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
