package hackerRank.StaticBlock;

import java.util.Scanner;

public class StaticBlock {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        if (breadth< 1 || height<1){
            throw new Exception("Breadth and height must be positive");
        } else {
            System.out.println(breadth * height);
        }
    }
}
