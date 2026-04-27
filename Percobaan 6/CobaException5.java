public class CobaException5 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a","b","c"};
        try {
            System.out.println(bil/0);
        } catch (ArithmeticException ai) {
            System.out.println("Pesan dari getMessage():");
            System.out.println(ai.getMessage());
        } finally {
            System.out.println("Blok finally akan selalu di eksekusi");
        }
    }
}
