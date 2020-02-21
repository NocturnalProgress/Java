package AutoSave;

import java.util.*;

class AutoSave {
    public static int counter = 0;

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("Timer working...");
                counter++;
                System.out.println(counter);
            }
        }, 0, 100000); // Change last number to change timer interval
    }
}