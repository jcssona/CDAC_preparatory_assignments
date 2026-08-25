package assignemntprograms;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jay","Sonawane",56000);
        Employee e2 = new Employee("Yash","Sonawane",100000);

        e1.displayEmployeeDetails();
        System.out.println();
        e2.displayEmployeeDetails();
        System.out.println();
        e1.modifySalary(12.5);
        e1.displayEmployeeDetails();
        System.out.println();
        e2.modifySalary(23.9);
        e2.displayEmployeeDetails();
        System.out.println();

        System.out.println("Employee 1 yearly salary is : "+e1.calculateYearlySalary());
        System.out.println("Employee 2 yearly salary is : "+e2.calculateYearlySalary());

    }
}
