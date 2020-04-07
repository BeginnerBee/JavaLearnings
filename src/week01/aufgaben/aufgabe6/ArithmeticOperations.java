package week01.aufgaben.aufgabe6;

public class ArithmeticOperations {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int result = 2 * x - 3 * y - 1; // -5 expected
        System.out.println(result);

        result = 1 - ((x)) + -y; // -2 expected
        System.out.println(result);

        result = 1 + -+x + -1; // -1 expected
        System.out.println(result);

        result = y * x / y + x % y; // 2 expected
        System.out.println(result);

        boolean bResult = x == 0; // false expected
        System.out.println(bResult);

        //bResult = 1 < y < 3; // compiler error

        bResult = (x > 0) && (x < 2); // true expected
        System.out.println(bResult);

        result = x++ + x + y-- - --y; // 5 expected
        System.out.println(result);
    }
}
