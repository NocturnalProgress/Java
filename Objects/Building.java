package Objects;

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
        } while (numfloors <= maxfloors);
    }
}
// Make Dog Object
// each Dog has a unique name variable associated with it
// has bark() method where it prints out a dog noise
// has getName() method which returns name
// has toString() method
// has a functionality where the dog can be "sitting" or not
/*
 * Dog anyname = new Dog("NAME");
 * 
 */