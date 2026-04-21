// percobaan 2

import java.io.*;

public class InputNumerik {
    public static void main(String[] args) throws IOException {

        System.out.print("Masukkan sebuah bilangan bulat: ");

        String temp;
        int bilangan = 0;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        temp = br.readLine();

        try {
            bilangan = Integer.parseInt(temp);
        } catch (NumberFormatException nfe) {
            System.out.println("Data yang dimasukkan " + "bukan bilangan bulat");
            System.exit(1);
        }

        System.out.println("Bilangan yang dimasukkan " + "adalah " + bilangan);
    }
}
