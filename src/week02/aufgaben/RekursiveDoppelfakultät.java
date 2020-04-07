package week02.aufgaben;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RekursiveDoppelfakultät {

    public static void main(String[] args) {
        scannerSessionForDoubleFactorial();
    }


    private static int rekursiveDouppelFakültät(int number) {
        if (number == 0) {
            System.out.print(number + "! = ");
            return 1;
        } else if (number == 1 || number == 2) {
            System.out.print(number + "! = ");
            return number;
        } else if (number > 2) {
            System.out.print(number + " * ");
            return number * rekursiveDouppelFakültät(number - 2);
        } else {
            System.out.print(number + " is not positive number! ");
            return -1;
        }
    }


    public static void scannerSessionForDoubleFactorial() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a positive integer number: ");
            Integer number = sc.nextInt();
            number = rekursiveDouppelFakültät(number);
            System.out.println(number);
            scannerSessionForDoubleFactorial();
        } catch (InputMismatchException e) {
            System.out.print("Please enter a proper positive integer number: ");
            scannerSessionForDoubleFactorial();
        }
    }
}