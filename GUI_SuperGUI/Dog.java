package GUI_SuperGUI;

import java.util.*;

class Dog {
    String randomname;
    String name;
    boolean isSitting;
    public Object assignName;
    String color;
    int randInt;
    String dogSays;
    String dogAction;

    public String toString() {
        String something = name;
        return something;
    }

    public Dog(String name) {
        List<String> list = Arrays.asList("Daraxus", "Chromblip", "Zarth", "Crebis", "Farlip", "Thorndip", "Prenus",
                "Grublim", "Dinglegorf", "Sarcobious", "Blumpid", "DingleSchwartz", "Arcondus", "Harblund", "Gruthden",
                "Crablus", "Skonk", "Stublen", "Draglop", "Goit-Tru", "Bucket");

        Random randInt = new Random();
        int rand = randInt.nextInt(list.size());
        String randomname = list.get(rand);
        this.name = randomname;
    }

    public String Speak() {
        Random r = new Random();
        randInt = r.nextInt((7 - 1) + 1) + 1;
        if (randInt == 1) {
            dogSays = ("Awooooo..");
        } else if (randInt == 2) {
            dogSays = ("Arf!");
        } else if (randInt == 3) {
            dogSays = ("Woof!");
        } else if (randInt == 4) {
            dogSays = ("Bark!");
        } else if (randInt == 5) {
            dogSays = ("Wuff!");
        } else if (randInt == 6) {
            dogSays = ("Sigh...");
        } else if (randInt == 7) {
            dogSays = ("Yip!");
        }

        return dogSays;
    }

    public String Gender() {
        List<String> list = Arrays.asList("Boy", "Girl");
        Random randInt = new Random();
        int rand = randInt.nextInt(list.size());
        String Gender = list.get(rand);
        return Gender;

    }

    public String isSitting() {
        Random r = new Random();
        randInt = r.nextInt((2 - 1) + 1) + 1;
        if (randInt == 1) {
            dogAction = ("sitting");
        } else if (randInt == 2) {
            dogAction = ("standing");
        }
        return dogAction;
    }

    public String coatColor() {
        List<String> list = Arrays.asList("Brown", "Black", "White", "Golden", "Red", "Yellow", "Cream", "Blue", "Grey",
                "Fawn");
        Random randInt = new Random();
        int rand = randInt.nextInt(list.size());
        String randomColor = list.get(rand);
        return randomColor;
    }

    public String collarColor() {
        List<String> list = Arrays.asList("Brown", "Black", "White", "Cyan", "Cobal", "Teal", "Rainbow", "Orange",
                "Yellow", "Magenta", "Lime");
        Random randInt = new Random();
        int rand = randInt.nextInt(list.size());
        String randomCollarColor = list.get(rand);
        return randomCollarColor;
    }

}