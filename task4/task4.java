public class task4
{
    private static int h1,h2,m1,m2 =0;
    private static int hours, minutes =0;

    public static void main(String[] args)
    {
        //initial value for our counter
        int num = 1;

        //Countdown for 24 hours
        //We got 1440 minutes in 24 hours, let's do a cycle
        for(int i = 0; i < 1440; i++)
            {
            //
                    h1 = hours/10;
                    h2 = hours%10;
            //
                    m1 = minutes/10;
                    m2 = minutes%10;


                if( h1 == m2 && h2 == m1 )
                {
                    System.out.println(num+") \n "+h1+""+h2+""+m1+""+m2+"\n");
                    num++;
                }

                minutes++;

                if( minutes == 60 )
                {
                    minutes = 0;
                    hours++;
                }
            }

    }
}
