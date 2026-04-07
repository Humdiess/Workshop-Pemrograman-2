public class TestManajerEmployee {
    public static void main(String[] args) {
        Employee1 employee = new Employee1("reicospeed", 20000.0);
        
        Manajer manager = new Manajer("budispeed", 35000.0, "IT Department");
        
        System.out.println("Nama: " + employee.getName());
        System.out.println("Gaji: " + employee.getSalary());
        System.out.println();
        
        System.out.println("Nama: " + manager.getName());
        System.out.println("Gaji: " + manager.getSalary());
        System.out.println("Departement: " + manager.getDepartement());
        System.out.println();
        
        System.out.println(employee.getName() + " adalah seorang Employee");
        System.out.println(manager.getName() + " adalah seorang Manajer di " + manager.getDepartement());
    }
}
