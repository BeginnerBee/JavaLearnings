package week05.aufgabe04;

import java.awt.*;

public class TextBox extends Rectangle implements Text {

    private String text;
    private int textColor;

    /* Constructor with rectangle and text information. If the rectangles
    are too small, the text may be over Rectangle borders. */
    public TextBox(Point point, Size size, int areaColor, String text, int textColor) {
        super(point, size, areaColor);
        this.text = text;
        this.textColor = textColor;
    }


    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getTextColor() {
        return textColor;
    }

    @Override
    public void draw(Visualization visualization) {
        super.draw(visualization);
        visualization.drawText(super.getPoint().x, super.getPoint().y, getText(), getTextColor());
    }

}
