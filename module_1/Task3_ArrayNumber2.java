import java.util.Random;
import java.util.Arrays;

public class Task3_ArrayNumber2 {

    public static int[] array = new int[16];

    public static int[] secondArray = new int[array.length];

    public static int number = array.length;



    public static void main(String[] args) {

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {

            int z = rand.nextInt(10);
            array[i] = z;
            System.out.print(array[i] + ", ");
        }
        check(array);

    }
//        for(int k = 1; k < array.length; k++) {
//
//            System.out.println(" R number is :" + digit);
//
//
//            if (digit != secondArray[k]) {
//                digit = array[k];
//                check();
//            }
//            else {break;}


//        System.out.println("\n");
//        System.out.println("number is :" + number);
//    }

    public static void check(int[] array) {

        for (int first = 0; first < array.length; first++) {
            boolean ok = false;
            for (int second = first + 1; second < array.length; second++)
            {
                if (array[first] == array[second])
                {
                    ok = true;
                    {System.out.println(ok);}
                    break;
                }else {{System.out.println(ok);}}
            }

            if(!ok)
            {System.out.println(array[first]);}
        }
    }
}