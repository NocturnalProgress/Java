package GUI.TerrainGeneratorv2;

import java.util.*;

import javax.swing.*;

public class Terrainv2 {
    int x;
    int y;
    int z;
    List<JButton> buttonList;
    int coalSpawn;
    boolean genCoal;
    boolean genIron;
    boolean genGold;
    boolean genLapus;
    boolean genEmerald;
    boolean genQuartz;
    boolean genDiamond;

    public Terrainv2(int x, int y, int z, boolean genCoal, boolean genIron, boolean genGold, boolean genLapus,
            boolean genEmerald, boolean genQuartz, boolean genDiamond) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.genCoal = genCoal;
        this.genIron = genIron;
        this.genGold = genGold;
        this.genLapus = genLapus;
        this.genEmerald = genEmerald;
        this.genQuartz = genQuartz;
        this.genDiamond = genDiamond;
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

    public void genOre() {
        if (genCoal == true) {
            int max = 256;
            int min = 5;
            int range = max - min + 1;
            System.out.println("Generating Coal!");
            for (int i = 0; i < 1; i++) {
                int rand = (int) (Math.random() * range) + min;
                System.out.println(rand);
            }
            int size = buttonList.size();
            System.out.println(size);
        } else {
            System.out.println("Not generating Coal!");
        }

        if (genIron == true) {
            System.out.println("Generating Iron!");
        } else {
            System.out.println("Not generating Iron!");
        }

        if (genGold == true) {
            System.out.println("Generating Gold!");
        } else {
            System.out.println("Not generating Gold!");
        }

        if (genLapus == true) {
            System.out.println("Generating Lapus Lazuli!");
        } else {
            System.out.println("Not generating Lapus Lazuli!");
        }

        if (genEmerald == true) {
            System.out.println("Generating Emerald!");
        } else {
            System.out.println("Not generating Emerald!");
        }

        if (genQuartz == true) {
            System.out.println("Generating Quartz!");
        } else {
            System.out.println("Not generating Quartz!");
        }

        if (genDiamond == true) {
            System.out.println("Generating Diamond!");
        } else {
            System.out.println("Not generating Diamond");
        }
    }

}