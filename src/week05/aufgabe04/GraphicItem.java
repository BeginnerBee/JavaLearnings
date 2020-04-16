package week05.aufgabe04;

import java.awt.*;

public interface GraphicItem {

    /*Returns the position of the shape on the x-axis and y-axis*/
    Point getPoint();

    /*Changes the position on the x and y axes*/
    week05.aufgabe04.Shape move(Point point);

    /*Moves the graphic to position 0/0.*/
    default void moveToCenter(week05.aufgabe04.Shape shape, Visualization v) {
        shape.move(new Point(0,0)).draw(v);
    }

    /*Checks whether the graphic is at position 0/0.*/
    default boolean isInCenter() {
        if(getPoint().x == 0 && getPoint().y == 0)
            return true;
        return false;
    }

    /*Returns the color of the graphic. If none is defined, black (0) is returned.*/
    default int getColor(Shape s) {
        if(s == null)
            return 0;
        return s.getAreaColor(); //Ayni method bu dizayn icin gereksiz gibi. Shape interface'inde de getAreaColor mevcut.
    }


}
