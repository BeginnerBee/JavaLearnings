package week05.aufgabe03;

import java.awt.*;

public interface GraphicItem {

    /*Returns the position of the shape on the x-axis and y-axis*/
    Point getPoint();

    /*Changes the position on the x and y axes*/
    void move(Point point);

}
