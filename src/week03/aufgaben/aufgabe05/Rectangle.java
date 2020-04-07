package week03.aufgaben.aufgabe05;

import java.awt.*;

public class Rectangle {

    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle(Point topLeft, int size) {
        this.topLeft = topLeft;
        this.bottomRight = new Point(topLeft.x + size, topLeft.y + size);
    }

    public boolean isSquare() {
        int xDistance = topLeft.x - bottomRight.x;
        int yDistance = topLeft.y - bottomRight.y;
        return xDistance == yDistance;
    }

    public boolean isSame(Rectangle other) {
        boolean isSameTopLeft = this.getTopLeft().x == other.getTopLeft().x
                && this.getTopLeft().y == other.getTopLeft().y;
        boolean isSameBottomRight = this.getBottomRight().x == other.getBottomRight().x
                && this.getBottomRight().y == other.getBottomRight().y;
        return isSameTopLeft && isSameBottomRight;
    }

    public boolean encloses(Rectangle other) {
        boolean isXEncloses = this.getTopLeft().x <= other.getTopLeft().x && this.bottomRight.x >= other.getBottomRight().x;
        boolean isYEncloses = this.getTopLeft().y <= other.getTopLeft().y && this.bottomRight.y >= other.getBottomRight().y;
        return isXEncloses && isYEncloses;
    }

    /*
        Soruda her bir R icin bottomRight degerlerin topLeft degerleden hep büyük alinmasi gerektigi belirtiliyor.
        Hoca da bütün test verilerini bu sekilde girmis. Bu varsayima bagli olarak R'lerin cakismama durumlarini iceleyen bir yol izledim.
    */
    public boolean overlaps(Rectangle other) {
        /*Hangi R'nin once verildigini bilmedigimizden ikisinin de ön siraya koyarak,
         ilk R'nin max X degerinin ikinci R'nin minumum X degerinden kucuk olup olmadigini kontrol ediyorum.
         Iki durumdan biri Dogru ise X eksenninde kesissmediklerini anlariz.
         Ayni islemi Y ekseni icin de yapiyprum*/
        boolean isXNotOverlaps = this.getBottomRight().x <= other.getTopLeft().x || other.getBottomRight().x <= this.getTopLeft().x;
        boolean isYNotOverlaps = this.getBottomRight().y <= other.getTopLeft().y || other.getBottomRight().y <= this.getTopLeft().y;

        return !(isXNotOverlaps || isYNotOverlaps);
    }

    public Rectangle stretch(int factor) {
        this.getBottomRight().setLocation(this.bottomRight.x + factor, this.bottomRight.y + factor);
        return this;
    }

    public Rectangle shrink(int factor) {
        this.getBottomRight().setLocation(this.bottomRight.x - factor,this.bottomRight.y - factor);
        return this;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

}
