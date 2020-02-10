package DogObj;

import java.util.*;

class Dog {
    String name;
    boolean isSitting;
    public Object assignName;
    String color;
    int randInt;

    public String toString() {
        String something = name;
        return something;
    }

    public Dog(String name) {
        List<String> nameList = Arrays.asList("Daraxus", "Chromblip", "Zarth", "Crebis", "Farlip", "Thorndip", "Prenus",
                "Grublim", "Dinglegorf", "Sarcobious", "Blumpid", "DingleSchwartz", "Arcondus", "Harblund", "Gruthden",
                "Crablus", "Skonk", "Stublen", "Draglop", "Goit-Tru", "Bucket");

        Random randInt = new Random();
        int x = randInt.nextInt(nameList.size());
        String randomname = nameList.get(x);

        this.name = randomname;
        System.out.println("This dog's name is " + randomname);
    }

    public void Speak() {
        Random r = new Random();
        randInt = r.nextInt((4 - 0) + 1) + 1;
        if (randInt <= 4) {
            System.out.println(name + " says: " + "Awoooooooooo");
        } else if (randInt >= 2) {
            System.out.println(name + " says: " + "Arf!");
        }
    }

    public void Gender() {
        List<String> list = Arrays.asList("Boy", "Girl");
        Random randInt = new Random();
        int rand = randInt.nextInt(list.size());
        String Gender = list.get(rand);
        System.out.println(name + " is a " + Gender);

    }

    // Make sit and stand better

    public void Sit() {
        boolean isSitting = true;
        if (isSitting == true) {
            System.out.println(name + " is sitting");
        } else if (isSitting == false) {
            System.out.println(name + " is standing");
        }
    }

    public void Stand() {
        boolean isSitting = false;
        if (isSitting == true) {
            System.out.println(name + " is sitting");
        } else if (isSitting == false) {
            System.out.println(name + " is standing");
        }
    }

    public void isSitting() {
        if (isSitting == true) {
            System.out.println(name + " is sitting");
        } else if (isSitting == false) {
            System.out.println("Dog is standing");
        }
    }

    public void Color() {
        List<String> furColor = Arrays.asList("Brown", "Black", "White", "Golden", "Red", "Yellow", "Cream", "Blue",
                "Grey", "Fawn");
        Random randColorInt = new Random();
        int y = randColorInt.nextInt(furColor.size());
        String randomColor = furColor.get(y);

        List<String> collarColor = Arrays.asList("Brown", "Black", "White", "Cyan", "Cobal", "Teal", "Rainbow",
                "Orange", "Yellow", "Magenta", "Lime");
        Random randCollarColorInt = new Random();
        int z = randCollarColorInt.nextInt(collarColor.size());
        String randomCollarColor = collarColor.get(z);

        System.out
                .println(name + "'s hair color is " + randomColor + " and their collar color is " + randomCollarColor);
    }

}