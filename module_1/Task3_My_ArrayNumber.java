import java.util.Random;
import java.util.Arrays;

public class Task3_My_ArrayNumber {

    private static int[] array = new int[16];
    private static int[] secondArray = new int[array.length];
    private static int counter = 0;

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int z = rand.nextInt(9) + 1;
            array[i] = z;
            System.out.print(array[i] + ", ");
            letsCheckFirstArray(array[i]);
        }
        System.out.println("\n");
        System.out.println("**************** Let's count: " + counter + " ****************");

   /*     for (int i = 0; i < secondArray.length; i++) {
                       System.out.println("1_Array" + array[i]);
                       System.out.println("2_Array" + secondArray[i]);
        }*/
    }

    private static void letsCheckFirstArray(int currentNumber) {

        for (int i = 0; i < array.length; i++) {
            //           System.out.println("approved: " + approved);
            if (isUnique(currentNumber)) {
                counter++;
                secondArray[counter] = currentNumber;
                //             System.out.println("secondArray[i]: " + secondArray[i]);
            }
        }
    }

    private static boolean isUnique(int num) {
        boolean unique = true;
        //      System.out.println("num: " + num);
        for (int i = 0; i < array.length; i++) {
            if (num == secondArray[i]) {
                unique = false;
            }
        }
        //       System.out.println("isUnique: " + unique);
        return unique;
    }
}