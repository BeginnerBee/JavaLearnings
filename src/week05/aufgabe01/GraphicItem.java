package week05.aufgabe01;

public interface GraphicItem {

    /*Returns the position of the shape on the x-axis*/
    int getX();

    /*Returns the position of the shape on the y-axis*/
    int getY();

    /*Changes the position on the x and y axes*/
    void move(int x, int y);

}
