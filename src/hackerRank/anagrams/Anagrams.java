package hackerRank.anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        char[] copyOfA = a.toCharArray();
        char[] copyOfB = b.toCharArray();
        Arrays.sort(copyOfA);
        Arrays.sort(copyOfB);
        return Arrays.equals(copyOfA,copyOfB);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}