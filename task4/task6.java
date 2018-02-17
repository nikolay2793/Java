import java.util.Random;
public class task6
{
    public static void main(String[] args)
    {
        int[][] Array = new int[7][4];
        Random rand = new Random();

        for (int i = 0; i < Array.length; i++)
        {
            for (int j = 0; j < Array[i].length; j++)
            {

                int z = rand.nextInt(10)-5;

                Array[i][j] = z;
                System.out.print(Array[i][j]+"\t");


            }
            System.out.println("");
        }



    }
}
