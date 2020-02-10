package KindOfInheritance;

class Something {
    public static void main(String[] args) {
        int[] thing = { 1, 2, 3, 4, 5 };
        Shape square = new Rectangle(thing);
        System.out.println(square);
        square.Perimeter();
        square.Area();
    }
}