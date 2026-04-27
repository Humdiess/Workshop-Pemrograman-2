public class satu {
    public static void main(String[] args) {
        int kar = 1;
        String st = "";
        boolean selesai = false;

        System.out.println("ketikkan suatu kalimat");

        while (!selesai) {
            try {
                kar = System.in.read();
                if (kar < -1 || kar == '\n')
                    selesai = true;
                st = st + (char) kar;
            } catch (Exception i) {
                System.out.println("salah");
            }
        }

        System.out.println("String:" + st);
    }
}
