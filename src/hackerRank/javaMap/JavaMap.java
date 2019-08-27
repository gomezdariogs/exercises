package hackerRank.javaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> phoneBook = new HashMap<>();
        int numberOfEntries=scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < numberOfEntries; i++){
            String name = scan.nextLine();
            int phoneNumber = scan.nextInt();
            scan.nextLine();
            phoneBook.put(name,phoneNumber);
        }
        while (scan.hasNext()){
            String personToFind = scan.nextLine();
            try{
                int temp = phoneBook.get(personToFind);
                System.out.println(personToFind+"="+temp);
            }catch(NullPointerException e){
                System.out.println("Not found");
            }
        }
    }
}
