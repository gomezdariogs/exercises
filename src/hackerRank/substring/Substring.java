package hackerRank.substring;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        if (s.length() > 0 && s.length() <101 && s.matches("^[a-zA-Z]*$")){
            System.out.println(s.substring(start,end));
        }else{
            System.out.println("The string must contain 1-100 alphabetic characters");
        }
    }
}
