public class TestBentuk {
    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran(7);
        Bentuk b2 = new PersegiPanjang(5, 7);
        Bentuk b3 = new Segitiga(2, 10);

        System.out.println("Luas Lingkaran: " + b1.getLuas());
        System.out.println("Luas Persegi: " + b2.getLuas());
        System.out.println("Luas Segitiga: " + b3.getLuas());
    }
}