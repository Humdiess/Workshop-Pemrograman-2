// percobaan 4
import java.io.PrintWriter;

public class DemoPrintWriter {
    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out, true);

        double d = 3.1416;
        int i = 123;
        byte b = 65;
        char c = 'A';
        String s = "Ini adalah string";

        pw.println("Data bertipe double : " + d);
        pw.println("Data bertipe int    : " + i);
        pw.println("Data bertipe byte   : " + b);
        pw.println("Data bertipe char   : " + c);
        pw.println("Data bertipe string : " + s);
    }
}
