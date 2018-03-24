import java.util.Random;

public class Horse extends Thread {

    private static final int CIRCLE_LENGTH = 1000;

    private String horseName;
    private int id;
    private static String winner = "";
    private static boolean raceOver = false;
    private static int distance = 0;

    public Horse(String horseName, int id) {
        this.horseName = horseName;
        this.id = id;
    }


    public void run() {
    //    System.out.println("run ");

        int distanceStep;
        int sleepTime;

        while (!raceOver) {
            try {
                distanceStep = randInt(30, 50);
                sleepTime = randInt(300, 400);

                Thread.sleep(sleepTime);
                distance += distanceStep;
                if (distance >= CIRCLE_LENGTH) {
                    raceOver = true;
                    System.out.println("Horse Name: " + horseName);
    //                System.out.println("raceOver " + raceOver);
                }

            } catch (Exception e) {
                e.printStackTrace();
                //Thread.currentThread().interrupt();
                //InterruptedException e
            }

        }
//        if (distance == CIRCLE_LENGTH) {
//            winner = horseName;
//        }
        winner = horseName;
        System.out.println("");
    }


    public int getHorseId() {
        return id;
    }

    public static boolean done() {
        return raceOver;
    }

    public int getDistance() {
        return distance;
    }

    public String getHorseName() {
        return horseName;
    }

    public static String getWinner() {
        return winner;
    }

    private static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}


