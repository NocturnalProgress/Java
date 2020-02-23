package TerrainGenerator;

import java.util.*;

public class Generate {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("Enter in your X variable.");
        int one = scan.nextInt();

        scan = new Scanner(System.in);
        System.out.println("Enter in your Y variable");
        int two = scan.nextInt();

        scan = new Scanner(System.in);
        System.out.println("Enter in your Z variable");
        int three = scan.nextInt();

        Terrain zero = new Terrain(one, two, three);
        zero.returnDimens();
    }
}