package Generics;

public class Box implements Comparable {

    String name;
    int age;

    public Box(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String nameOf() {
        return name;
    }

    public int ageOf() {
        return age;
    }

    public String toString() {
        return "Name: " + name + "  Age: " + age;
    }

    /**
     * pre: item instanceof Person post: returns -1 if this.ageOf() < item.ageOf(),
     * 0 if this.ageOf() = item.ageOf(), 1 if this.ageOf() > item.ageOf()
     */
    public int compareTo(Object item) {

        int itemAge = ((Box) item).ageOf();
        int result;

        if (ageOf() < itemAge) {
            result = -1;
        } else if (ageOf() > itemAge) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}