package Interfaces;

import java.security.*;
import java.util.*;

public class Animal implements LivingCreature {
    String name;
    String animalType;
    String animalGroup;
    String animalSpecies;

    // Create a text based game
    // Player
    // Animal
    // The player and the animal have a set health
    // The animal is randomly generated and each animal has a different health
    // Create a random list that gives out actions that do certain things to the
    // Players health

    public static void main(String[] args) {
        Animal Sarcobious = new Animal();
        Sarcobious.name();
        Sarcobious.eat();
        Sarcobious.travel();
        Sarcobious.animalGroup();
        Sarcobious.animalSpecies();
    }

    public void eat() {
        System.out.println(name + " eats.");
    }

    public void travel() {
        System.out.println(name + " travels.");

    }

    public void name() {
        List<String> nameList = Arrays.asList("Daraxus", "Chromblip", "Zarth", "Crebis", "Farlip", "Thorndip", "Prenus",
                "Grublim", "Dinglegorf", "Sarcobious", "Blumpid", "DingleSchwartz", "Arcondus", "Harblund", "Gruthden",
                "Crablus", "Skonk", "Stublen", "Draglop", "Goit-Tru", "Bucket");

        SecureRandom randInt = new SecureRandom();
        int x = randInt.nextInt(nameList.size());
        String randomname = nameList.get(x);

        this.name = randomname;
        System.out.println("It's name is " + randomname);
    }

    public void animalGroup() {
        List<String> animalTypeList = Arrays.asList("Invertebrate", "Fish", "Amphibians", "Reptile", "Bird", "Mammal");

        SecureRandom randInt = new SecureRandom();
        int x = randInt.nextInt(animalTypeList.size());
        String randAnimalType = animalTypeList.get(x);

        this.animalGroup = randAnimalType;
        System.out.println("This animal's classification is a " + randAnimalType);
    }

    public void animalSpecies() {
        if (animalGroup == "Amphibians") {
        } else if (animalGroup == "Fish") {
            animalSpecies = "Shark";
        } else if (animalGroup == "Reptile") {
            animalSpecies = "Dinosaur";
        } else if (animalGroup == "Bird") {
            animalSpecies = "Potoo";
        } else if (animalGroup == "Mammal") {
            animalSpecies = "Liger";
        } else if (animalGroup == "Invertebrate") {
            animalSpecies = "Colossal Squid";
        }
        System.out.println("This animal is a " + animalSpecies);
    }
}
// Animal group defines the animal species list