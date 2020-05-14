package Objects;

class Thing {
    public static void main(String[] args) {
        System.out.println("Hola");
        Building idk = new Building(10);

        System.out.println(idk);
        int x = idk.returnfloors();
        System.out.println(x);
        idk.Build();
        System.out.println(idk);

        Building b = new Building(50);
        int v = b.returnfloors();
        System.out.println(v);
        b.BigBuild();
        System.out.println(b);
    }

    public static void yes() {
        System.out.println("How many buildings would you like?");
    }

}