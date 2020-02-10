package RandomThings;

class Infinite {
    static int x = 0;
    static boolean start = true;

    public static void main(String[] args) {
        do {
            x++;
            System.out.println("Count: " + x);
        } while (start = true);
    }
}