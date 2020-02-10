package InfiniteFib;

import java.util.*;

class InfiniteFib {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many fibs do you want?");
        int number = scan.nextInt();
        scan.close();
        int x = 0;
        int y = 0;
        int z = 1;
        do {
            y = y * z;
            x = x + 1;
            y = y + 1;
            System.out.println(y);
        } while (x <= number);
    }






    
}