package TerrainGenerator;

public class Terrain {
    int x;
    int y;
    int z;

    public Terrain(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        String anything = "X = " + x;
        return anything;
    }

    public void returnDimens() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
    }
}