package KindOfInheritance;

class Rectangle extends Shape {

    public Rectangle(int[] sideLengths) {
        super(sideLengths);
        numOfSides = 4;

    }

    public int Area() {
        int Area = 0;
        Area = sideLengths[0] * sideLengths[1];
        System.out.print(Area);
        return 0;
    }

    public int Perimeter() {
        int Perimeter = 0;
        Perimeter = sideLengths[0] * 2 + sideLengths[1] * 2;
        System.out.println("Perimeter " + Perimeter);
        return Perimeter;
    }
}