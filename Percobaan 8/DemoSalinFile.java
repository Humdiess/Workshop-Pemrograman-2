import java.io.*;
 
public class DemoSalinFile {
    public static void main(String[] args) {
        FileInputStream finput = null;
        FileOutputStream foutput = null;
        int data;
 
        try {
            finput = new FileInputStream("file1.txt");
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File input tidak ditemukan");
            return;
        }
 
        try {
            foutput = new FileOutputStream("file2.txt");
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File output tidak dapat terbentuk");
            return;
        }
 
        try {
            while ((data = finput.read()) != -1) {
                foutput.write(data);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            return;
        }
 
        try {
            finput.close();
            foutput.close();
        }
        catch (IOException ioe) {}
    }
}
