package hackerRank.javaInheritanceII;

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.superClass());
        System.out.println("15 + 10 = "  + adder.add(15,10));
    }
}
