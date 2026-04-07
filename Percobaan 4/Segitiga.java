class Segitiga extends Bentuk {
    private double a;
    private double t;

    public Segitiga(double a, double t) {
        this.t = t;
        this.a = a;
    }

    public double getAlas() {
        return a;
    }

    public double getTinggi() {
        return t;
    }

    public double getLuas() {
        return 0.5*a*t;
    }


}
