package week01.aufgabe1;

import java.util.Scanner;

public class DoubleFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Undefined");
        } else if (number % 2 == 1) {
            System.out.println(doubleFactorial(number));
        } else if (number % 2 == 0){
            System.out.println(doubleFactorial(number));
        }
        scanner.close();
    }

    private static int doubleFactorial(int number) {
        int product = 1;
        int firstValue = number % 2 == 1 ? 1 : 2;
        for (int counter = firstValue; counter <= number; counter += 2) {
            product *= counter;
        }
        return product;
    }
}
