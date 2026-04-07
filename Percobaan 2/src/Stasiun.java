class AcaraTV {
    private String acara;
    private String stasiunTV;

    public void setAcara(String acara) {
        this.acara = acara;
    }

//    public String getAcara() {
//        return acara;
//    }

    public void setStasiunTV(String stasiunTV) {
        this.stasiunTV = stasiunTV;
    }

//    public String getStasiunTV() {
//        return stasiunTV;
//    }

    public void cetak() {
        System.out.println("Acara " + acara + " StasiunTV " + stasiunTV);
    }
}

public class Stasiun {
    public static void main(String[] args) {
        AcaraTV a = new AcaraTV();
        a.setStasiunTV("Indosiar");
        a.setAcara("Sinetron");
        a.cetak();
    }
}

