package hackerRank.javaList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new LinkedList();
        Scanner scan = new Scanner(System.in);
        int amountOfElements = scan.nextInt();
        for (int i = 0; i<amountOfElements;i++){
            int number = scan.nextInt();
            listOfNumbers.add(number);
        }
        int amountOfQueries = scan.nextInt();
        for (int i=0;i<amountOfQueries;i++){
            String query = scan.next();
            if (query.equals("Insert")){
                int index = scan.nextInt();
                int element = scan.nextInt();
                listOfNumbers.add(index, element);
            }else{ //Delete
                int index = scan.nextInt();
                listOfNumbers.remove(index);
            }
        }
        for (int i = 0; i < listOfNumbers.size();i++){
            System.out.print(listOfNumbers.get(i) + " ");
        }
    }
}