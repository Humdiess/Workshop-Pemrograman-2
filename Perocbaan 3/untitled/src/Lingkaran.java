public class Lingkaran {
    private double jari;

    public void IsiJari(Double jari) {
        this.jari = jari;
    }

    public double GetLuas() {
//        luas lingkaran
        return 3.14*jari*jari;
    }

    public double GetKeliling() {
//        keliling lingkaran
        return 2*3.14*jari;
    }

    public void GetHasil() {
        System.out.println("jadi luasnya " + GetLuas() + " sedangkan kelilingnya " +  GetKeliling());
    }
}
