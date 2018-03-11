import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import  java.util.List;

public class Task3_ArrayNumber {

    public static int[] array = new int[16];



    public static void main(String[] args) {

        Random rand = new Random();
   //     ArrayList list = new ArrayList(Arrays.asList(array));
        ArrayList list = new ArrayList();

        for (int i = 0; i < array.length; i++) {

            int z = rand.nextInt(9) + 1;
            array[i] = z;
            System.out.print(array[i] + ", ");

            list.add(array[i]);
            list.set(i,array[i]);
        }
        System.out.print(list);
        remove(list);
        System.out.print(list);
    }

    private static void remove(List<?> list)
    {
        int count = list.size();

        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++)
            {
                if (list.get(i).equals(list.get(j)))
                {
                    list.remove(j--);
                    count--;
                }
            }
        }
    }



}