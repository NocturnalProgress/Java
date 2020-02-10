package ManyThingsThing;

import java.util.*;

// Figure out how to close a scanner without breaking every scanner

class Idk {

    public static void main(String[] args) {

        p("Welcome to the many things thing.");
        p("Press 1 for the Temperature Converter.");
        p("Press 2 for the Percentage Calculator.");
        p("Press 3 to get System Properties.");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num == 1) { // Start TempConverter
            TempConverter();
        } else if (num == 2) { // Start PercentCalc
            PercentCalc();
        } else if (num == 3) { // Start SysProperties
            SysProperties();
        } else { // Restarts Program

            System.out.print("\033[H\033[2J"); // Clears console
            System.out.flush(); // Clears console
            p("Number Invalid. Choose another number.");
            main(args);
        }

    }

    public static void p(String s) { // Makes printing easier
        System.out.println(s);
    }

    private static void PercentCalc() { // PercentCalc Program
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Percentage Calculator!");
        System.out.println("Type in your numerator."); // Gets numer
        float numer = scan.nextInt();
        System.out.println("Now type in your denominator."); // Gets denom
        float denom = scan.nextInt();

        float fract = (numer / denom) * 100; // Math Stuff = Fraction
        System.out.println("Here's your percentage! " + fract);
    }

    private static void TempConverter() { // TempConverter Program
        System.out.println("Welcome to the Temperature Converter!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in a temperature."); // Gets temp
        int temp = scan.nextInt();

        scan = new Scanner(System.in);
        System.out.println("Would you like to convert to C or F?"); // Duh
        String type = scan.nextLine();

        if (type.equalsIgnoreCase("F")) { // Converts to Fahrenheit
            temp = (temp * 9 / 5) + 32;
            System.out.print(temp + " Fahrenheit");
        } else if (type.equalsIgnoreCase("C")) { // Converts to Celsius
            temp = (temp - 32) * 5 / 9;
            System.out.println(temp + " Celsius");
        } else {
            System.out.println("Invaild Command");
        }
    }

    private static void SysProperties() { // SysProperties Program
        String OS = System.getProperty("os.name");
        System.out.println(OS);
    }

}