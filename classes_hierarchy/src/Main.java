public class Main
{
    public static void main(String[] args)
    {
        Class1 cl1 = new Class1(5.789);
        cl1.bark();

        Class2 cl2 = new Class2();
        cl2.bark();

        Class3 cl3 = new Class3();
        cl3.bark("Brrrr!!!",12);

        System.out.println(cl1.berries);

    }
}
