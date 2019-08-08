package gfg.loops;

import java.util.*;
import java.lang.*;

/**
 * For a given N, prints the sum of even and odd integers of the first N natural numbers.
 */
class Sums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N, and the numbers you want to sum: ");
        int n = scanner.nextInt();
        while (n < 0) {
            System.out.println("N must be positive");
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int sumEven = 0;
            int sumOdd = 0;
            int number = scanner.nextInt();
            while (number < 0) {
                System.out.println("The numbers must be positive");
                number = scanner.nextInt();
            }
            for (int j = 0; j <= number; j++) {
                if (j % 2 == 0) {
                    sumEven += j;
                } else {
                    sumOdd += j;
                }
            }
            System.out.println(sumEven + " " + sumOdd);
        }
    }
}