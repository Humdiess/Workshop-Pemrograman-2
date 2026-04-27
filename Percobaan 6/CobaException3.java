public class CobaException3 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil/0);
        } catch (ArithmeticException ai) {
            System.out.println("Error aritmetik");
        } catch (Exception e) {
            System.out.println("Ada error yang terjadi");
        }
    }
}
