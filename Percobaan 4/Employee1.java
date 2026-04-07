import java.util.Date;

public class Employee1 {
    private static final double BASE_SALARY = 15000.0;
    private String name;
    private double salary;
    private Date birthDate;

    public Employee1(String name, double salary, Date DoB) {
        this.name = name;
        this.salary = salary;
        this.birthDate = DoB;
    }

    public Employee1(String name, double salary) {
        this (name, salary, null);
    } 

    public Employee1(String name, Date DoB) {
        this (name, BASE_SALARY, DoB);
    }

    public Employee1(String name) {
        this (name, BASE_SALARY);
    }

    public Employee1() {
        this ("Employee", BASE_SALARY);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

}