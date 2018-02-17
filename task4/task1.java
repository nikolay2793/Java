import java.util.Scanner;

public class task1

{

    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, type any number !!!");
        int n = scan.nextInt();
        int sum = 0;
        sumNumbers(n, sum);
    }

    private static void sumNumbers(int n, int sum)
    {
        // if value not equal to zero
        if(n!=0)
        {
            sum = n%10 + sum;

            // it will put new n number without last digit, because int type, and sum will be the same,
            // and we get some kind of cycle

                 sumNumbers(n/10, sum);
        }
        else System.out.println(sum);
    }


}
