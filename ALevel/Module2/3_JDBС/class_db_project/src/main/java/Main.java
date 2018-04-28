import model.MyClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String ADDRESS_OF_FILE = "C:\\Java\\class_db_project\\class_db_project\\src\\main\\resources\\classes_info.txt";

    public static void main(String[] args) throws IOException {
        Main objMain = new Main();
        objMain.deleteDataFormTable();
        objMain.printList(objMain.convertToList());

        List<MyClass> listClassFromFile = objMain.createListClassFromFile(ADDRESS_OF_FILE);
        objMain.insertListClassToDB(listClassFromFile);
        objMain.printList(objMain.convertToList());


        objMain.findInformationAboutClass("1a", objMain.convertToList());
        System.out.println("-----------------------------------");
        objMain.findInformationAboutClass("11a", objMain.convertToList());
        System.out.println("-----------------------------------");
        objMain.findInformationAboutClass("2a", objMain.convertToList());
        System.out.println("-----------------------------------");
    }

    public List<MyClass> createListClassFromFile(String addressOfFile) throws IOException {
        List<MyClass> listClassFromFile = new ArrayList<>();

        String address = addressOfFile;

        String str = new String(Files.readAllBytes(Paths.get(address)));

        String[] stringArray = str.split("\n");

        for (int i = 0; i < stringArray.length; i++) {

            String[] wordsArray = stringArray[i].split("\t");

            int id = Integer.parseInt(wordsArray[0]);
            String className = wordsArray[1];
            int pupilsNumber = Integer.parseInt(wordsArray[2]);
            String curatorName;
            if (i == (stringArray.length - 1)) {
                curatorName = wordsArray[3];
            } else {
                curatorName = wordsArray[3].substring(0, wordsArray[3].length() - 1);
            }

            listClassFromFile.add(new MyClass(id, className, pupilsNumber, curatorName));
        }
        return listClassFromFile;
    }

    public void insertListClassToDB(List<MyClass> list) {
        DB_Connection objectDBConnection = new DB_Connection();
        Connection connection = objectDBConnection.getConnection();
        for (MyClass myClass : list) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO my_table(id, className, pupilsNumber, curatorName) VALUES (?,?,?,?)";
                ps = connection.prepareStatement(query);
                ps.setInt(1, myClass.getId());
                ps.setString(2, myClass.getClassName());
                ps.setInt(3, myClass.getPupilsNumber());
                ps.setString(4, myClass.getCuratorName());

                //System.out.println(ps);
                ps.executeUpdate();
                //connection.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void insertNewClassToDB(int id, String className, int pupilsNumber, String curatorName) {
        DB_Connection objectDBConnection = new DB_Connection();
        Connection connection = objectDBConnection.getConnection();

        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO my_table(id, className, pupilsNumber, curatorName) VALUES (?,?,?,?)";
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, className);
            ps.setInt(3, pupilsNumber);
            ps.setString(4, curatorName);

            //System.out.println(ps);
            ps.executeUpdate();
            //connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteDataFormTable() {
        DB_Connection objectDBConnection = new DB_Connection();
        Connection connection = objectDBConnection.getConnection();

        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM my_table";
            ps = connection.prepareStatement(query);

            //System.out.println(ps);
            ps.executeUpdate();

            //connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public List<MyClass> convertToList() {
        List<MyClass> classes = new ArrayList<>();
        DB_Connection objectDBConnection = new DB_Connection();
        Connection connection = objectDBConnection.getConnection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM my_table";
            ps = connection.prepareStatement(query);

            //System.out.println(ps);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("id"));
                String className = rs.getString("className");
                int pupilsNumber = Integer.parseInt(rs.getString("pupilsNumber"));
                String curatorName = rs.getString("curatorName");
                MyClass newClass = new MyClass(id, className, pupilsNumber, curatorName);
                classes.add(newClass);
            }

            //connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return classes;
    }

    public void printList(List list) {
        System.out.println("~~~~~~~~~~~~~DB Content:~~~~~~~~~~~~~");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void findInformationAboutClass(String className, List<MyClass> classes) {
        boolean flagResult = false;
        for (MyClass myClass : classes) {
            if (myClass.getClassName().equals(className)) {
                System.out.println("REQUEST " + className + ": " + myClass);
                flagResult = true;
            }
        }
        if (flagResult == false) {
            System.out.println("REQUEST " + className + ": " + "Class with the name: " + className + " no in the data base!");
        }
    }


}