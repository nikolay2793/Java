import faculty.Biological;
import faculty.Chemical;
import faculty.Faculty;

import java.util.Scanner;

public class Main {

    private static String facultyName;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Faculty faculty;


        System.out.println("Where do YOU want to apply my friend ?? Choose Your Faculty Please, " +
                "Type Your Name to Registrate !!!");

        System.out.println("1: Biological");
        System.out.println("2: Chemical");
        while (true) {
            switch (scanner.nextInt())
            {
                case 1:
                    faculty = new Biological();
                    facultyName = faculty.name();
                    //System.out.println("Biology!!!");

                    faculty.areYouReady();
                    System.out.println("Yours score is: "+ faculty.score());
                    if(faculty.score()>33.3)
                    {decision(true);}
                    else{
                    decision(false);
                    }
                    System.exit(0);
                    break;

                case 2:
                    faculty = new Chemical();
                    facultyName = faculty.name();
                    //System.out.println("Chemistry!!!");

                    faculty.areYouReady();
                    System.out.println("Yours score is: "+ faculty.score());
                    if(faculty.score()>26.1)
                    {decision(true);}
                    else{
                        decision(false);
                    }
                    System.exit(0);
                    break;

                default:
                    System.out.println("Stop. I don't want to learn anymore!!!");
            }
        }
    }



    private static void decision(boolean decision)
    {
        if(decision)
        {
            System.out.println("Congratulations!!! You just entered the "+ facultyName +" faculty of university");
        }
        else{
            System.out.println("Try again later next Year!!! Good Luck!!!");
        }
    }
}
