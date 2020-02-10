package Recursion;

public class InfiniteRecursion {
    static int count = 0;

    static void p() {
        count++;
        System.out.println("hello " + count);
        p();
    }

    public static void main(String[] args) {
        p();
    }
}