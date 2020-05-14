package Inheritance;

class Building {
    int numfloors = 0;
    int maxfloors;

    public Building(int maxfloors) {
        this.maxfloors = maxfloors;

    }

    public void Build() {
        if (numfloors < maxfloors) {
            numfloors = numfloors + 1;
        }
    }

    public int returnfloors() {
        return numfloors;
    }

    public String toString() {
        String something = "Number of floors: " + numfloors;
        return something;
    }

    public void BigBuild() {
        do {
            numfloors = numfloors + 1;
        } while (numfloors < maxfloors);
    }
}
