package week05.aufgabe05;

public enum NiceColors {
    BLUE(0x1f497d),
    RED(0xc0504d),
    GREEN(0x9bbb59),
    ORANGE(0xf79646),
    WHITE(0xffffff),
    BLACK(0x000000);

    private final int color;

    NiceColors(final int color) {
        this.color = color;
    }

    public int getValue() { return color; }


}

/*
BLUE = 0x1f497d
 RED = 0xc0504d
 GREEN = 0x9bbb59
 ORANGE = 0xf79646
 WHITE = 0xffffff
 BLACK = 0x000000
* */


