package TempConverter;

import java.util.*;

class TempConverter {
    public static void main(String[] args) {

        System.out.println("Welcome to the Temperature Converter!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in a temperature.");
        int temp = scan.nextInt();
        scan.close();

        scan = new Scanner(System.in);
        System.out.println("Would you like to convert to C or F?");
        String type = scan.nextLine();
        scan.close();

        if (type.equals("F")) { // Converts to Fahrenheit
            temp = (temp * 9 / 5) + 32;
            System.out.print(temp);
        } else if (type.equals("C")) { // Converts to Celsius
            temp = (temp - 32) * 5 / 9;
            System.out.println(temp);
        } else
            System.out.println("Invaild Command");
    }
}
