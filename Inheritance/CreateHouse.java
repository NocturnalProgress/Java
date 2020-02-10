package Inheritance;

import java.util.*;

class House extends Building {
    int numPeople = 0;
    int maxPeople;

    public House(int maxfloors, int maxPeople) {
        super(maxfloors);
        this.maxPeople = maxPeople;
    }

    public void Reproduction() {
        if (numPeople < maxPeople) {
            numPeople = numPeople + 1;
        }
    }

    public void BigReproduction() {
        do {
            numPeople = numPeople + 1;
        } while (numPeople < maxPeople);
    }

    public int returnPeople() {
        return numPeople;

    }

    public String toString() {
        String thing = super.toString() + " and there are " + numPeople + " people in this house.";
        return thing;

    }

    public void houseColor() {
        List<String> furColor = Arrays.asList("Brown", "Black", "White", "Golden", "Red", "Yellow", "Cream", "Blue",
                "Grey", "Fawn");
        Random randColorInt = new Random();
        int y = randColorInt.nextInt(furColor.size());
        String randomColor = furColor.get(y);
        System.out.println("The house is: " + randomColor);
    }

}