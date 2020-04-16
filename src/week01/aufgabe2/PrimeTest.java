package week01.aufgabe2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeTest {

    public static void main(String[] args) {
        getAndCheckNumbers();
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        // The check for the number 2 and 3
        if (number <= 3)
            return true;

        if (number % 2 == 0 || number % 3 == 0)
            return false;

        for (int i = 5; i * i <= number; i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void getAndCheckNumbers() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive natural number: ");
            int n = sc.nextInt();
            if (n == 0) {
                System.out.print(n + " is not a prime number");
                sc.close();
            } else if (isPrime(n)) {
                System.out.print("Enter a positive natural number: ");
                System.out.println(n + " is a prime");
                getAndCheckNumbers();
            } else {
                System.out.print("Enter a positive natural number: ");
                System.out.println(n + " is not prime");
                getAndCheckNumbers();
            }
        } catch (InputMismatchException e) {
            System.out.println("Your entry is not a positive natural number!!!");
            getAndCheckNumbers();
        }
    }


}
