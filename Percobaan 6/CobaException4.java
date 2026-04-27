public class CobaException4 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a","b","c"};
        try {
            System.out.println(b[3]);
            System.out.println(bil/0);
        } catch (ArithmeticException ai) {
            System.out.println("Error aritmetik");
        } catch (ArrayIndexOutOfBoundsException n) {
            System.out.println("Error karena melebihi kapasitas array");
        } catch (Exception e) {
            System.out.println("Ada error yang terjadi");
        }
    }
}
