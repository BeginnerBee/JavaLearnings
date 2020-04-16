package week01.aufgabe3;

import java.util.*;

public class Eratosthenes {

    public static void main(String[] args) {
        findAllPrimes();
    }

    public static void findAllPrimes() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number (number > 2): ");
            int upLimit = sc.nextInt();

            if (upLimit > 2) {
                int[] start = new int[upLimit - 1];
                for (int i = 0; i <= upLimit - 2; i++) {
                    start[i] = i + 2;
                }

                for (int i = 2; i < start.length + 2; i++) {
                    for (int j = 0; j < start.length; j++) {
                        if(start[j] == 0 || start[j] < i ||(double) start[j] / i == 1.0) {
                            continue;
                        } else if(start[j] % i == 0){
                            start[j] = 0;
                        }
                    }
                }

                int[] result = Arrays.stream(start).filter(i -> i > 0).toArray();

                System.out.println(Arrays.toString(result));

                findAllPrimes();
            } else {
                System.out.println("The number you enter is less than 2.");
                sc.close();
            }

        } catch (InputMismatchException e) {
            System.out.println("Your entry is not a positive natural number!!!");
            findAllPrimes();
        }
    }
}

