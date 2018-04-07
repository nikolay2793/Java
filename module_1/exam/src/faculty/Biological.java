package faculty;

import java.util.Scanner;

public class Biological implements Faculty {

    private  static  double score = 0;
    private  static  boolean examination = true;

    @Override
    public String name() {
        return "Biological";
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
                " passing exams to the BEST BIOLOGICAL FACULTY EVER!!" + "\n");
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
        System.out.println("So. The first question is: " +
                "What type of animal is the most KINKY ???"+"\n");

        System.out.println("1: RAT");
        System.out.println("2: KITTI");
        System.out.println("3: FROG");
        System.out.println("4: HERON");
        System.out.println("5: HUMAN BEEN");

        while (examination) {
            switch (scanner.nextInt()) {
                case 1:
                    score += 0.2;
                    break;
                case 2:
                    score += 12;
                    break;
                case 3:
                    score += 0.5;
                    break;
                case 4:
                    score += 1.1;
                    break;
                case 5:
                    score += 0.3;
                    break;
                default:
                    System.out.println("Faster, faster, my friend!");
            }
            System.out.println("The answer, of course, is: KITTY. Everybody knows that.." + "\n");
            System.out.println("The next question is:  " +
                    "Why people cannot fly??" + "\n");

            System.out.println("1: They are too silly");
            System.out.println("2: Oh, I actually can");
            System.out.println("3: They doesn't have any wings or so.. ");
            System.out.println("4: They are too heavy");
            System.out.println("5: Only frogs can fly");

            switch (scanner.nextInt()) {
                case 1:
                    score += 1;
                    break;
                case 2:
                    score -= 2;
                    break;
                case 3:
                    score += 2;
                    break;
                case 4:
                    score += 13;
                    break;
                case 5:
                    score += 3;
                    break;
                default:
                    System.out.println("Faster, faster, my friend!");
            }
            System.out.println("The answer, of course, is: People are too heavy, " +
                    "You are not a frog, so You can't fly" + "\n");
            System.out.println("The next question is:  " +
                    "If YOU, will go to the store, What WILL YOU CHOOSE APPLE OR PEN??");
            System.out.println("WHAT ARE YOU CHOOSE IN THE STORE APPLE OR PEN" +
                    " ANSWER ME WHAT YOU WILL CHOOSE??????" + "\n");
            System.out.println("1:Pen");
            System.out.println("2:Apple");
            System.out.println("3:PineapplePen");

            switch (scanner.nextInt()) {
                case 1:
                    score += 0.2;
                    break;
                case 2:
                    score += 10;
                    break;
                case 3:
                    score -= 5;
                    break;
                //   return;

                default:
                    System.out.println("Faster, faster, my friend!");
            }

            System.out.println("The answer, of course, is: APPLE " +
                    "You are a young biologist and definitely should be " +
                    "more interested to look into APPLEs rather than pens..." + "\n");
            System.out.println("The next question is:  " +
                    " Which organelle converts the chemical energy stored in food into " +
                    " compounds that are more convenient for the " +
                    "cell to use ");

            System.out.println("1: chloroplast");
            System.out.println("2: Golgi apparatu");
            System.out.println("3: endoplasmic reticulu");
            System.out.println("4: mitochondrio");

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
            System.out.println("The answer, of course, is: mitochondrio !!! " + "\n");
            System.out.println("The next question is:  Which of the following organisms are prokary?");

            System.out.println("1: plants");
            System.out.println("2: animals");
            System.out.println("3: bacteria");
            System.out.println("4: all of the abo");

            switch (scanner.nextInt()) {
                case 1:
                    score += 0.2;
                    break;
                case 2:
                    score -= 2.2;
                    break;
                case 3:
                    score += 14.7;
                    break;
                case 4:
                    score -= 2.5;
                    break;

                default:
                    System.out.println("Faster, faster, my friend!");
                    break;
            }
            System.out.println("The answer, of course, is: bacteria !!! " + "\n");
            System.out.println("The next question is:  What TYPE OF ANIMAL YOU ARE???");

            System.out.println("1: Tiger");
            System.out.println("2: Cow");
            System.out.println("3: Giraffe");
            System.out.println("4: Elephant");
            System.out.println("5: Monkey");
            System.out.println("6: KINKY KITTY");
            System.out.println("7: Pig");
            System.out.println("8: Horse");

            switch (scanner.nextInt()) {
                case 1:
                    score += 6;
                    break;
                case 2:
                    score -= 4;
                    break;
                case 3:
                    score += 3;
                    break;
                case 4:
                    score -= 8;
                    break;
                case 5:
                    score += 3;
                    break;
                case 6:
                    score -= 9;
                    break;
                case 7:
                    score += 2;
                    break;
                case 8:
                    score -= 7;
                    break;

                default:
                    System.out.println("Faster, faster, my friend!");
                    break;
            }
            System.out.println("I was just curious... But Kitties are very kinky " + "\n");

            ////------checking score------////

            System.out.println("Ok... Let's check Your result..." + "\n");
            this.score = score;
            examination = false;

        }
    }
}
