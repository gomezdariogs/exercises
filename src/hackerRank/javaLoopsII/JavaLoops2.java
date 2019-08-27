package hackerRank.javaLoopsII;

import java.util.*;
import java.io.*;

class JavaLoops2 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        if (q >= 0 && q <= 500) {
            for (int i = 0; i < q; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if (a >= 0 && a <= 50 && b >= 0 && b <= 50 && n >= 1 && n <= 15) {
                    for (int j=0; j<=n;j++){
                        int result = a + (2^j * b) + (2^(j+1)*b);

                    }
                }
            }
        } else {
            System.out.println("Please enter a number between 0 and 500");
        }
        in.close();
        Date asd = new Date();
    }
}

