package hackerRank.stringBasics;

import java.io.*;
import java.util.*;

/*

The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.

Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
 */

public class StringBasics {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int sum = A.length() + B.length();
        System.out.println(sum);
        if (A.compareTo(B) >0  ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String firstWordCapitallized = A.substring(0,1).toUpperCase() + A.substring(1);
        String secondWordCapitallized = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(firstWordCapitallized + " " + secondWordCapitallized);

    }
}
