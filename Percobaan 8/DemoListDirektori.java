import java.io.File;
 
public class DemoListDirektori {
    public static void main(String[] args) {
        String dir = "testdir";
        File f = new File(dir);
 
        String[] daftar = f.list();
        java.util.Arrays.sort(daftar);
 
        System.out.println("File dan direktori dalam " + dir);
        System.out.println();
 
        for(int i=0; i<daftar.length; i++) {
            File fTemp = new File(dir + "/" + daftar[i]);
            if (fTemp.isDirectory()) {
                System.out.println(daftar[i] + "\t\t<DIR>");
            }
            else {
                System.out.println(daftar[i]);
            }
        }
    }
}
