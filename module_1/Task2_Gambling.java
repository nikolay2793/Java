import java.util.Random;
import java.util.Scanner;

public class Task2_Gambling {
    private static int a;
    private static int b;
    private static int counter = 3;

    public static void main(String[] args) {
        b = randInt(1,10);
//        System.out.println("B: " + b);
        do game();
        while (a != b && counter > 0);
    }

    private static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    private static void game() {
        System.out.println("Please enter a value from 1 to 10 for take a chance to win !!! \n");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a < 10 && a > 1) {
            if (a == b) {
                System.out.println("Looks like YOU just won that game!");
                return;
            }
            counter--;
            if (a < b) {
                System.out.println("Conceived number is greater than that! \n");
            } else if (a > b) {
                System.out.println("Conceived number is less than that! \n");
            }
            System.out.println(counter + " attempts left ! \n");
            if (counter == 0) {
                System.out.println("Sorry.");
            }
        }else{System.out.println("You are out of range!!! \n");}
    }
}
