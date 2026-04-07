class Lingkaran extends Bentuk {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getLuas() {
        return Math.PI*this.r*this.r;
    }

}