package faculty;

import java.util.Scanner;

public class Chemical implements Faculty {

    private  static  double score = 0;
    private  static  boolean examination = true;



    @Override
    public String name() {
        return "Chemical";
    }

    @Override
    public double score()
    {
        return score;
    }


    @Override
    public String registrate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please! Type Your Name !!!");
        String name = scanner.nextLine();
        System.out.println("Yay! Great!! ''" + name + "'' You have successfully registered for" +
                " passing exams to the BEST CHEMICAL FACULTY EVER!!" + "\n");
        return name;

    }

    @Override
    public void areYouReady() {
        String name = registrate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("So. " + name + ". My Friend. Are You ready to Start RIGHT NOW ???!! " +"\n");

        System.out.println("1: LET'S GO AHEAD!!!! MASTER.");
        System.out.println("2: No, I'm too afraid of you, LET'S GET OUTTA HERE right now !!!");
        while (examination) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("OH!! Looks like, You are a real MEN!!"+"\n");
                    examinations(0);
                    break;

                case 2:
                    System.out.println("You are so pathetic...");
                    break;

                default:
                    System.out.println("You are so pathetic...");
            }
        }
    }

    @Override
    public void  examinations(double score) {

        Scanner scanner = new Scanner(System.in);
        //question 1
        System.out.println("So. The first question is: " +
                "Who invented periodic table of the chemical elements ???"+"\n");

        System.out.println("1: Tesla");
        System.out.println("2: Einstein");
        System.out.println("3: Stroustrup");
        System.out.println("4: Mendileev");
        System.out.println("5: Nakamoto");

        while (examination) {
            switch (scanner.nextInt()) {
                case 1:
                    score -= 0.2;
                    break;
                case 2:
                    score += 2;
                    break;
                case 3:
                    score += 0.5;
                    break;
                case 4:
                    score += 8.1;
                    break;
                case 5:
                    score += 0.3;
                    break;
                default:
                    System.out.println("Faster, faster, my friend!");
            }
            System.out.println("The answer, of course, is: Mendileev..." + "\n");

            //question 2

            System.out.println("The next question is:  ");
            System.out.println("Alkanes are also known as" + "\n");

            System.out.println("1: Saturated hydrocarbon");
            System.out.println("2: Unsaturated hydrocarbon");
            System.out.println("3: Paraffin ");
            System.out.println("4: None of the above");


            switch (scanner.nextInt()) {
                case 1:
                    score += 0.1;
                    break;
                case 2:
                    score -= 0.2;
                    break;
                case 3:
                    score += 14;
                    break;
                case 4:
                    score += 0.2;
                    break;
                default:
                    System.out.println("Faster, faster, my friend!");
            }
            System.out.println("The answer, of course, is: Paraffin" + "\n");

            //question 3

            System.out.println("The next question is:  Boric Acid cannot be used:" + "\n");

            System.out.println("1:As antiseptic iin medicine");
            System.out.println("2:For washing eyes");
            System.out.println("3:In soda Bottle");
            System.out.println("4:For enamels and glazes");


            switch (scanner.nextInt()) {
                case 1:
                    score += 12.2;
                    break;
                case 2:
                    score += 1;
                    break;
                case 3:
                    score -= 0.2;
                    break;
                case 4:
                    score += 0.5;
                    break;
                //   return;

                default:
                    System.out.println("Faster, faster, my friend!");
            }

            System.out.println("The answer, of course, is: As antiseptic iin medicine" + "\n");

            //question 4

            System.out.println("The next question is:  Which of the halogens is radioactive ?? " + "\n");

            System.out.println("1: F");
            System.out.println("2: C1");
            System.out.println("3: I");
            System.out.println("4: At");


            switch (scanner.nextInt()) {
                case 1:
                    score += 0.2;
                    break;
                case 2:
                    score -= 0.2;
                    break;
                case 3:
                    score += 0.7;
                    break;
                case 4:
                    score += 12.5;
                    break;

                default:
                    System.out.println("Faster, faster, my friend!");
                    break;
            }

            System.out.println("The answer, of course, is: At !!! " + "\n");

            //question 5

            System.out.println("The next question is:  Bauxite is an ore of?");

            System.out.println("1: Aluminium");
            System.out.println("2: Boron");
            System.out.println("3: Carbon");
            System.out.println("4: Gallium");


            switch (scanner.nextInt()) {
                case 1:
                    score += 12;
                    break;
                case 2:
                    score -= 2.2;
                    break;
                case 3:
                    score += 0.7;
                    break;
                case 4:
                    score -= 0.5;
                    break;

                default:
                    System.out.println("Faster, faster, my friend!");
                    break;
            }
            System.out.println("The answer, of course, is: Aluminium !!! " + "\n");


            ////------checking score------////

            System.out.println("Ok... Let's check Your result..." + "\n");
            this.score = score;
            examination = false;

        }
    }
}
