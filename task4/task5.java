import java.util.Random;

public class task5
{
    public static void main(String[] args)
    {
        //
        int[][] Array = new int[8][5];
        Random rand = new Random();

        for (int i = 0; i < Array.length; i++)
        {
            for (int j =0; j < Array[i].length; j++)
            {
                int z = rand.nextInt(89)+10;

                Array[i][j] = z;
                System.out.print(Array[i][j]+" ");

            }
            System.out.println(" ");
        }
    }
}
