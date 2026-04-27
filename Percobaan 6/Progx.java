class Progx {
    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;
        //Baris ini tidak dilewati lagi
    }

    public static void main(String args[]) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException ex) {
            System.out.println("Saya tangkap sinyal " + ex);
        }
    }
}
