package week05.aufgabe02;

public interface Shape extends GraphicItem {

    /*Returns the color code for the surface of the shape*/
    int getAreaColor();

    /*Purpose: The figure should be on the graphic Draw surface visualization.*/
    void draw(Visualization visualization);
}
