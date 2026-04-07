class Buku {
    String pengarang;
    String judul;

    void info() {
        System.out.println("Judul:" + judul + " pengarang:" + pengarang);
    }
}

public class TestBuku {
    public static void main(String args[]) {

        Buku b1 = new Buku();
        b1.judul = "Siaga merah";
        b1.pengarang = "Helga Anindya";
        b1.info();

        Buku b2 = new Buku();
        b2.judul = "Siaga hitam";
        b2.pengarang = "David Noor";
        b2.info();
    }
}