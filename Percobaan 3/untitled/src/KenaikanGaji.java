public class KenaikanGaji {
    private double GajiPokok;
    private double Persen;
    private String Jabatan;
    private String Id;

    KenaikanGaji(String Id, String Jabatan, double GajiPokok, double Persen) {
        this.Id = Id;
        this.Jabatan = Jabatan;
        this.GajiPokok = GajiPokok;
        this.Persen = Persen;
    }

    public double getGajiPokok() {
        return GajiPokok * (1 + Persen / 100);
    }

    public String getJabatan() {
        return Jabatan;
    }

    public String getId() {
        return Id;
    }
}
