package assignemntprograms;

public class Student {
    public String name;
    public String rollNumber;
    public int marks;

    public Student(String name,String rollNumber,int marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayStudentsData()
    {
        System.out.println("Student name is : "+ name);
        System.out.println("Student roll no is : "+ rollNumber);
        System.out.println("Student marks : "+ marks);
    }
}
