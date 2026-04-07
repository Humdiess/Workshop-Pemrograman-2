public class Coba {
    public static void main(String[] args) {
        Mahasiswa mhs=new Mahasiswa();
        mhs.setNrp(56120);
        mhs.setNama("Masyhudi Affandi");
        System.out.println("Nama Mahasiswa :" + mhs.getNama() + " NRP :" + mhs.getNrp());
    }
}

class Mahasiswa {
    private int nrp;
    private String nama;

    public int getNrp() {
        return nrp;
    }
    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
