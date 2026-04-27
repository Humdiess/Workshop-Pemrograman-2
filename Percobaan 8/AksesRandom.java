import java.io.*;
 
public class AksesRandom {
    public static void main(String[] args) throws IOException {
        RandomAccessFile berkas = null;
        berkas = new RandomAccessFile("abc.dat", "rw");
        berkas.writeBytes("ABCDEFGHIJKLMNOPQRSTUVW");
        char kar = ' ';
 
        berkas.seek(0);
        System.out.println("isi berkas: ");
        while (berkas.getFilePointer() < berkas.length()) {
            kar = (char) berkas.readByte();
            System.out.print(kar);
        }
 
        System.out.println();
 
        berkas.seek(3);
        berkas.writeByte((int)'Z');
 
        System.out.println("Sesudah penggantian");
 
        berkas.seek(0);
        System.out.println("isi berkas ");
        while (berkas.getFilePointer() < berkas.length()) {
            kar = (char) berkas.readByte();
            System.out.print(kar);
        }
    }
}
