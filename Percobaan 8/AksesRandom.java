import java.io.*;
 
public class AksesRandom {
    public static void main(String[] args) throws IOException {
        RandomAccessFile berkas = null;
        berkas = new RandomAccessFile("abc.dat", "rw");
        berkas.writeBytes("pens");
        char kar = ' ';
 
        berkas.seek(0);
        System.out.println("isi berkas: ");
        while (berkas.getFilePointer() < berkas.length()) {
            kar = (char) berkas.readByte();
            System.out.print(kar);
        }
 
        System.out.println();
 
        berkas.seek(8);
        berkas.writeByte((int)'P');
 
        System.out.println("Sesudah penggantian");
 
        berkas.seek(0);
        System.out.println("isi berkas ");
        while (berkas.getFilePointer() < berkas.length()) {
            kar = (char) berkas.readByte();
            System.out.print(kar);
        }
    }
}
