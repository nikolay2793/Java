import java.util.Random;
import java.util.Arrays;

public class Task3_ArrayNumber {

    public static int[] array = new int[16];

    public static int[] secondArray = new int[array.length];

    public static int number = 0;

    public static int digit;


    private static boolean ok = false;


    public static void main(String[] args) {

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {

            int z = rand.nextInt(9) + 1;
            array[i] = z;
            System.out.print(array[i] + ", ");
        }

        compare();

        digit = array[0];

        for (int i = 0; i < array.length; i++) {
            check();
            compare();
        }

        System.out.println("\n");
        System.out.println("number is :" + number);
    }

    public static void check() {

        for (int j = 0; j < array.length; j++) {

            digit = array[j];
            secondArray[j] = digit;

//            System.out.print("digit" + digit + ", ");
//            System.out.print("secondArray" + secondArray[j] + ", ");

            if (ok) {
                number++;
            }
        }
    }

    public static void compare() {

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] != secondArray[j])
                {
                    ok = true;

                }
            }
            System.out.println("secondArray" + secondArray[i]);
        }
    }
}
