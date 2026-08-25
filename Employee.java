package assignemntprograms;

public class Employee {
    public String firstName;
    public String lastName;
    public double monthlySalary;

    public Employee(String firstName,String lastName,double monthlySalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void displayEmployeeDetails()
    {
        System.out.println("First Name : "+ firstName);
        System.out.println("Last Name : "+ lastName);
        System.out.println("Monthly salary : "+ monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void modifySalary(double percentage)
    {
        monthlySalary = monthlySalary + (monthlySalary * percentage / 100);
    }

    public double calculateYearlySalary()
    {
        return monthlySalary * 12;
    }
}
