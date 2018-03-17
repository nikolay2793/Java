package exam;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.io.File;

public class fileWrite {

    public static void main(String[] args)  {

        //readFileDirectory();
        writefile();

    }
/*
    public static void readFileDirectory()
    {
        System.out.println("PLease, type any path, where we would to go...");
        Scanner scan = new Scanner(System.in);
        File folder = new File(scan.nextLine());
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }*/

    public static void writefile() {

        try {
            System.out.println("PLease, type any path, where we would to go...");
            Scanner scan = new Scanner(System.in);
            File folder = new File(scan.nextLine());
            File[] listOfFiles = folder.listFiles();

            Writer output = null;
            File file = new File("C:\\results\\results.txt");
            output = new BufferedWriter(new FileWriter(file));
           // String content = "This is the content to write into file\n";
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    System.out.println("File " + listOfFiles[i].getName());
                   // System.out.println("File " + sdf.format(listOfFiles[i].lastModified()));
                    output.write(listOfFiles[i].getName() + "     date of the last modification  " +
                            "   " + sdf.format(listOfFiles[i].lastModified()) + System.lineSeparator());

                } else if (listOfFiles[i].isDirectory()) {
                    System.out.println("Directory " + listOfFiles[i].getName());
                    //output.write(listOfFiles[i].getName());
                    //  output.write(listOfFiles[i].getName() + System.lineSeparator());
                    output.write(listOfFiles[i].getName() + "     date of the last modification  " +
                            "   " + sdf.format(listOfFiles[i].lastModified()) + System.lineSeparator());
                }
            }

/*
            for (int i = 0; i < 10; i++) {
                //
                output.write(content);
              //  output.write(listOfFiles[i].getName());
            }*/

            output.close();
            System.out.println("File has been written");

        } catch (Exception e) {
            System.out.println("Could not create file");
        }
    }

}
