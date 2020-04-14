package week05.aufgaben.aufgabe01;

public class TextBox extends Rectangle implements Text {

    private String text;
    private int textColor;

    /* Constructor with rectangle and text information. If the rectangles
    are too small, the text may be over Rectangle borders. */
    public TextBox(int left, int top, int width, int height, int areaColor, String text, int textColor) {
        super(left, top, width, height, areaColor);
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
        visualization.drawText(super.getX(), super.getY(),  getText(), getTextColor());
    }

}
