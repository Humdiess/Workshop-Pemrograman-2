class Manajer extends Employee1 {
    private String departement;

    public Manajer(String name, double salary, String dept) {
        super(name, salary);
        departement = dept;
    }

    public Manajer(String n, String dept) {
        super(n);
        departement = dept;
    }

    public Manajer(String dept) {
        super();
        departement = dept;
    }

    // Getter untuk department
    public String getDepartement() {
        return departement;
    }
}