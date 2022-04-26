package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConexionBD {

    public String getURL() throws FileNotFoundException{
        File doc = new File("src/Resources/Connection.txt");
        Scanner obj = new Scanner(doc);
        String conn = "";
        while (obj.hasNextLine()){
            conn = conn + obj.nextLine() + " ";
        }
        String[] partes = conn.split(" ");
        String url = partes[0];
        return url;
    }
    
    public String getUSER() throws FileNotFoundException{
        File doc = new File("src/Resources/Connection.txt");
        Scanner obj = new Scanner(doc);
        String conn = "";
        while (obj.hasNextLine()){
            conn = conn + obj.nextLine() + " ";
        }
        String[] partes = conn.split(" ");
        String user = partes[1];
        return user;
    }
    
    public String getPASSWORD() throws FileNotFoundException{
        File doc = new File("src/Resources/Connection.txt");
        Scanner obj = new Scanner(doc);
        String conn = "";
        while (obj.hasNextLine()){
            conn = conn + obj.nextLine() + " ";
        }
        String[] partes = conn.split(" ");
        String pass = partes[2];
        return pass;
    }
}
