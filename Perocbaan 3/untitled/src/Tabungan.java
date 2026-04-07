public class Tabungan {
    public int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public double AmbilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            return jumlah;
        }
        return 0;
    }
}
