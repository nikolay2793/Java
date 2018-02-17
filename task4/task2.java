public class task2

{
    public static void main(String[] args)

    {
        int n = 9;
        int a = 1, b = 1;
        int fibbo = 2;

        // show values of our variables a and b
        if(a==1 || b==1)
            System.out.println(a);
            System.out.println(b);

        // making cycle for 9 iterations
        for(int i=0;i<n;i++)
        {
            //calculate fibbo value
            fibbo = a + b;
            a = b;
            b = fibbo;

            System.out.println(fibbo);
        }
    }
}