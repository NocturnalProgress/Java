package KindOfInheritance;

abstract class Shape {
    int[] sideLengths;
    int numOfSides;

    public Shape(int[] sideLengths) {
        this.sideLengths = sideLengths;
        numOfSides = sideLengths.length;

    }

    public String toString() {
        String good = ("There are " + numOfSides + " sides.");
        return good;
    }

    public int returnSides() {
        return numOfSides;
    }

    public int Perimeter() {
        int Perimeter = 0;
        int runtime = 0;
        do {
            Perimeter = Perimeter + sideLengths[runtime];
            runtime = runtime + 1;
        } while (runtime < numOfSides);
        System.out.println("Perimeter " + Perimeter);
        return Perimeter;
    }

    public abstract int Area();

}