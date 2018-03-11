import java.util.Random;
import java.util.Arrays;

public class Task3_ArrayNumber {

   public static int[] array = new int[16];

   public static int[] secondArray = new int[array.length];

   public static int number = 0;

   public static int digit;




   private static boolean ok = false;

//    public static int next;
//    public static int prev;


    public static void main(String[] args) {

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {

            int z = rand.nextInt(9)+1;
            array[i] = z;
            System.out.print(array[i] + ", ");
        }


        digit = array[0];


        for(int i = 0; i < array.length; i++) {

            check();
        }

        System.out.println("\n");
        System.out.println("number is :" + number);
    }

    public static void check() {


        for (int j = 0; j < array.length; j++) {

            digit = array[j];
            secondArray[j] = digit;

            System.out.print("digit" + digit + ", ");
            System.out.print("secondArray" + secondArray[j] + ", ");

            if(ok)
            {
                number ++;
            }
        }
    }

    public static void compare() {

        for(int i = 0; i < array.length; i++)
        {
            if(digit != secondArray[i])
            {
               ok = true;
                System.out.print(secondArray[i]);
            }
        }
    }
}
