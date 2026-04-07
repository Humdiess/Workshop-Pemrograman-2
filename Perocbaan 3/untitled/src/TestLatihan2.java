public class TestLatihan2 {
    public static void main(String[] args) {
        double GajiSanti, GajiRonny, GajiIndra;
        String JabatanSanti, JabatanRonny, JabatanIndra, IdSanti, IdRonny, IdIndra;

        KenaikanGaji Santi = new KenaikanGaji("SBY0001", "Manager", 400000, 5);
        KenaikanGaji Ronny = new KenaikanGaji("BDG0317", "Staff", 200000, 7.5);
        KenaikanGaji Indra = new KenaikanGaji("JKT0189", "Direktur", 800000, 3);

        GajiSanti = Santi.getGajiPokok();
        GajiRonny = Ronny.getGajiPokok();
        GajiIndra = Indra.getGajiPokok();

        JabatanSanti=Santi.getJabatan();
        JabatanRonny=Ronny.getJabatan();
        JabatanIndra=Indra.getJabatan();

        IdSanti = Santi.getId();
        IdRonny = Ronny.getId();
        IdIndra = Indra.getId();

//        santi
        System.out.println("Santi");
        System.out.println("No pegawai: "+ IdSanti);
        System.out.println("No jabatan: "+ JabatanSanti);
        System.out.println("Gaji baru: "+ GajiSanti);
        System.out.println("");

//        ronny
        System.out.println("Ronny");
        System.out.println("No pegawai: "+ IdRonny);
        System.out.println("No jabatan: "+ JabatanRonny);
        System.out.println("Gaji baru: "+ GajiRonny);
        System.out.println("");

//        Indra
        System.out.println("Indra");
        System.out.println("No pegawai: "+ IdIndra);
        System.out.println("No jabatan: "+ JabatanIndra);
        System.out.println("Gaji baru: "+ GajiIndra);
        System.out.println("");
    }
}
