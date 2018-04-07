import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;


public class HorseRace {
    public static void main(String[] args) throws InterruptedException, java.io.IOException {

        long startTime = System.currentTimeMillis();

        Horse[] horses = new Horse[]{
                new Horse("Go Cavalo", 1),
                new Horse("Lizard", 2),
                new Horse("Storm", 3),
                new Horse("Hippo", 4),
                new Horse("Crazy Five", 5),
                new Horse("Enigma", 6),
                new Horse("Magic Mac", 7)};

        System.err.println( "Start !!!" );
        for (int i=0; i<horses.length; i++) {
            horses[i].start();
        }

//        Thread[] threads = new Thread[horses.length];
//
//        for (int i = 0; i < horses.length; i++) {
//            threads[i] = new Thread(horses[i]);
//            threads[i].start();
//        }
//        for (int i = 0; i < horses.length; i++) {
//            while (threads[i].isAlive()) {
//
//
//            }
//        }

//        System.out.println("\nAnd the winner is " + Horse.getWinner());


    }
}
