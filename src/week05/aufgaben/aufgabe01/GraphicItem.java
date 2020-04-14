package week05.aufgaben.aufgabe01;

import java.awt.*;

public interface GraphicItem {

    /*Returns the position of the shape on the x-axis*/
    int getX();

    /*Returns the position of the shape on the y-axis*/
    int getY();

    /*Changes the position on the x and y axes*/
    Shape move(int x, int y);

}
