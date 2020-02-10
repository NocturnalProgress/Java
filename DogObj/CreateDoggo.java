package DogObj;

import java.util.*;

class CreateDoggo {

    public static void main(String[] args) {
        Dog newDog = new Dog("");
        newDog.Gender();
        newDog.Stand();
        newDog.Speak();
        newDog.Color();

        System.out.println(""); // Just a spacer

        Dog anotherDog = new Dog("");
        anotherDog.Gender();
        anotherDog.Sit();
        anotherDog.Speak();
        anotherDog.Color();

        DogPark();

    }

    public static void DogPark() {
        System.out.println("");
        System.out.println("You walk into a dog park...");
        System.out.println("How many dogs do you see?");
        Scanner scan = new Scanner(System.in);
        int numOfDogs = scan.nextInt();

        if (numOfDogs == 0) {
            System.out.println("The dog park is empty.. how sad.");
        } else if (numOfDogs == 1) {
            Dog dog1 = new Dog("");
            dog1.Gender();
            dog1.Sit();
            dog1.Speak();
            dog1.Color();
            System.out.println(""); // Spacer
        } else if (numOfDogs == 2) {
            Dog dog1 = new Dog("");
            dog1.Gender();
            dog1.Sit();
            dog1.Speak();
            dog1.Color();
            System.out.println(""); // Spacer

            Dog dog2 = new Dog("");
            dog2.Gender();
            dog2.Sit();
            dog2.Speak();
            dog2.Color();
            System.out.println(""); // Spacer
        } else if (numOfDogs == 3) {
            Dog dog1 = new Dog("");
            dog1.Gender();
            dog1.Sit();
            dog1.Speak();
            dog1.Color();
            System.out.println(""); // Spacer

            Dog dog2 = new Dog("");
            dog2.Gender();
            dog2.Sit();
            dog2.Speak();
            dog2.Color();
            System.out.println(""); // Spacer

            Dog dog3 = new Dog("");
            dog3.Gender();
            dog3.Sit();
            dog3.Speak();
            dog3.Color();
            System.out.println(""); // Spacer
        }
        scan.close();
    }

}
