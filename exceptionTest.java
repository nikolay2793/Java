import java.io.*;

public class exceptionTest
{
    public static void main(String[] args)
    {
        read("C:\\test.txt");
    }

    public  static void read (String fileName)
    {

        try {
            //If the constructor throws an exception, the finally block will NOT execute
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder stringBuilder = new StringBuilder();

            try {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                }
            } finally {
                reader.close();
            }

 //           return stringBuilder.toString();

        }
        catch (IOException ex)
        {
            System.out.println("Problem occured : " + ex.getMessage());
        }

    }

}
