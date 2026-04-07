class PersegiPanjang extends Bentuk {
    private double p;
    private double l;

    PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public double getPanjang() {
        return p;
    }

    public double getLebar() {
        return l;
    }

    public double getLuas() {
        return p*l;
    }


}