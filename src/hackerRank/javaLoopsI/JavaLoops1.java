package hackerRank.javaLoopsI;

import java.util.*;

/**
 * Objective
 * In this challenge, we're going to use loops to help us do some simple math.
 *
 * Task
 * Given an integer, N, print its first 10 multiples. Each multiple N*i  (where 1<=i<=10) should be printed on a new line in the form: N x i = result.
 *
 * Input Format
 *
 * A single integer, N.
 *
 * Constraints
 * 2<=N<=20
 */

public class JavaLoops1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number between 2 and 20");
        int n = scanner.nextInt();
        if (n>=2 && n<= 20){
            for (int i = 1; i <=10;i++){
                System.out.println(n + " x " + i  +" = " + n*i  );
            }
        }else{
            System.out.println("N must be a number between 2 and 20");
        }
    }
}
