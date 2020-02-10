package Inheritance;

class Home {
    public static void main(String[] args) {
        House Home = new House(3, 4);
        Home.BigBuild();
        Home.BigReproduction();
        Home.houseColor();
        System.out.println(Home);

        House ThiccHome = new House(500, 500);
        ThiccHome.BigBuild();
        ThiccHome.BigReproduction();
        ThiccHome.houseColor();
        System.out.println(ThiccHome);

        House HypeHouse = new House(35, 12);
        HypeHouse.BigBuild();
        HypeHouse.BigReproduction();
        HypeHouse.houseColor();
        System.out.println(HypeHouse);

    }
}