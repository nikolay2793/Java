public class Main
{

    public static void main(String[] args)
    {

        Person prs_001 = new Person(" Guard (skull) John", "M", 77);
        Person prs_002 = new Person(" Uncle (horse) Bill", "M", 37);
        Person prs_003 = new Person(" Helena (fat-nurse) Cummins", "F", 47);
        Person prs_004 = new Person(" Odd Mike", "M", 100);

        Student std_001 = new Student("Jim (monster) Lebowski", "F", 18, "834588",13.466);
        Student std_002 = new Student("Hendra (vapid) Whinehouse", "F", 15, "56334",63.5);
        Student std_003 = new Student("Rizz (humster eater) Crown", "F", 17, "23364",23.75);
        Student std_004 = new Student("Dirk (noname) Dickinson", "M", 18, "25754",73.5);

        Teacher tchr_001 = new Teacher("Duncan (murderer) Redd", "M", 42,422.324,"Geography");
        Teacher tchr_002 = new Teacher("Margaret (slut) Redd", "F", 26,2522.77,"Potion-making");
        Teacher tchr_003 = new Teacher("Benedikt (homeless) Killjoy", "M", 22,92.04,"Computer science");
        Teacher tchr_004 = new Teacher("Steve (money) Horowitz", "M", 36,7992.98,"Vice Principal");

        CollegeStudent cl_Std_001 = new CollegeStudent("Mohhamad", "M", 20, "894588",6.236, "Medicine", 2);
        CollegeStudent cl_Std_002 = new CollegeStudent("Jemma (duck) James", "F", 19, "456488",1.436, "Biochemist", 2);


        std_001.setIdNumber("123321");
        std_001.setGender("M");
        std_003.setAge(16);
        tchr_002.setSalary(2745.65);
        cl_Std_002.setYear(1);



        Person[] p = new Person[14];
        p[0] = prs_001;
        p[1] = prs_002;
        p[2] = prs_003;
        p[3] = prs_004;

        p[4] = tchr_001;
        p[5] = tchr_002;
        p[6] = tchr_003;
        p[7] = tchr_004;

        p[8] = std_001;
        p[9] = std_002;
        p[10] = std_003;
        p[11] = std_004;

        p[12] = cl_Std_001;
        p[13] = cl_Std_002;


        System.out.println("\n");

        for (int i = 0; i < p.length; i++ )
        {
            System.out.print(p[i]);
            System.out.println("\n");
        }

 //       String abc =  std_001.getIdNumber();
 //       System.out.print(abc);

    }
}
