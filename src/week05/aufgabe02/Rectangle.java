package week05.aufgabe02;

//TODO: The upper left point of the rectangle is defined by getX () / getY ()

public class Rectangle implements Shape {

    private int left;
    private int top;
    private int width;
    private int height;
    private int color;

    public Rectangle(int left, int top, int width, int height, int color) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /*Returns the width of the rectangle*/
    public int getWidth() {
        return width;
    }

    /*Returns the height of the rectangle*/
    public int getHeight() {
        return height;
    }

    /*Changes width and height*/
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getAreaColor() {
        return color;
    }

    @Override
    public void draw(Visualization visualization) {
        visualization.drawRectangle(left, top, width, height, color);
    }

    @Override
    public int getX() {
        return left;
    }

    @Override
    public int getY() {
        return top;
    }

    @Override
    public void move(int x, int y) {
        this.left = x;
        this.top = y;
    }
}
