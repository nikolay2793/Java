import java.io.*;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class Task4_popularPasswords {

    private static Map<String, String> logins_passwords = new HashMap<String, String>();
    private static Map<String, Integer> top_passwords = new HashMap<String, Integer>();
    private static String[] passwArray;
    private static int z = 1;

    public static String read(String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder stringBuilder = new StringBuilder();
        String currentString;

        while ((currentString = reader.readLine()) != null) {
            stringBuilder.append(currentString);
            // System.out.println("beep" + currentString);
            getWords(currentString);
            stringBuilder.append("\n");
        }
        reader.close();

        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        //   System.out.println(read("C:\\Java\\Pssw.txt"));
        read("C:\\Java\\Pssw.txt");
        //   System.out.println("words_count: " + words_count);
        System.out.println("\n");
        System.out.println("logins: " + logins_passwords.keySet());
        System.out.println("passwords: " + logins_passwords.values());

        int c = 0;
        passwArray = new String[logins_passwords.size()];
        for (String string : logins_passwords.keySet())
        //for(int i = 0; i < words_count.size(); i++)
        {
            String value = logins_passwords.get(string);
            passwArray[c] = value;
            //System.out.println("array: " + passw[counter]);
            c++;
        }
        System.out.println("\n");
        checkForMatches();
        System.out.println("\n");
        System.out.println("*** PASSWORDS SORTED TOP ***");
        System.out.println("\n");
        sortHashMap();
    }


    public static void getWords(String path) {

        // String[] words = path.split("\\s+");
        String[] words = path.split(":");

        for (int i = 0; i < words.length; i++) {

            logins_passwords.put(words[i], words[++i]);
            //    System.out.println("words_count: " + words_count);
        }
    }

    private static void checkForMatches() {

        String[] passw = new String[logins_passwords.size()];
        int counter = 0;
        String currentPassword;

        for (String s : logins_passwords.keySet())
        //for(int i = 0; i < words_count.size(); i++)
        {
            String value = logins_passwords.get(s);
            //System.out.println("v: " + value);
            currentPassword = value;
            passw[counter] = value;
            //System.out.println("array: " + passw[counter]);
            counter++;

            int howManyTimes = 0;
            for (int i = 0; i < passw.length; i++) {
                if (currentPassword.equals(passw[i])) {
                    //    System.out.println("I'm here");
                    howManyTimes++;
                } else {
                    //   System.out.println("I'm somewhere else...");
                }
            }
            if (isUnique(value)) {
                System.out.println("howManyTimes: " + currentPassword + " : " + howManyTimes);
                top_passwords.put(currentPassword, howManyTimes);
            }
        }
    }

    private static boolean isUnique(String pssw) {

        boolean unique = true;
        int counter = 0;

        for (int i = z; i < logins_passwords.size(); i++) {
//            System.out.println("!" + i + " " + z);
//            System.out.println("I'm here" + pssw + " " + passwArray[i]);
            if (pssw.equals(passwArray[i])) {
                counter++;
                if (counter == 1) {
                    unique = false;
                }
//                System.out.println("I'm here: " + unique);
            }
        }
        z++;
//      System.out.println("isUnique: " + unique);
        return unique;
    }

    private static void sortHashMap() {
        Set<Entry<String, Integer>> set = top_passwords.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
                set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }

}





