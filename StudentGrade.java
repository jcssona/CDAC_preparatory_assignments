package assignemntprograms;

import java.util.Scanner;

public class StudentGrade {

    public static int calculateTotalMarks(int[] nums)
    {
        int sum = 0;

        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
        }

        return sum;
    }


    public static void calculateGradeBasedOnTotalMarks(int[] studentMarks)
    {
        int totalMarks = calculateTotalMarks(studentMarks);

        if(totalMarks >=90 && totalMarks<=100)
        {
            System.out.println("Total Marks : "+totalMarks+" and Grade is : Ex");
        }

        else if (totalMarks >=80 &&  totalMarks <=89) {
            System.out.println("Total Marks : "+totalMarks+" and Grade is : A");
        }

        else if(totalMarks >= 70 && totalMarks<= 79 )
        {
            System.out.println("Total Marks : "+totalMarks+" and Grade is : B");
        }

        else if (totalMarks >= 60 && totalMarks <= 69)
        {
            System.out.println("Total Marks : "+totalMarks+" and Grade is : C");
        }

        else
        {
            System.out.println("Total Marks : "+totalMarks+" and Grade is : D");
        }
    }


    public static void main(String[] args) {
        int[] studentMarks = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the marks for student in subject "+(i+1)+" is : ");
            int marks = sc.nextInt();
            if(marks > 20)
            {
                System.out.println("Cant enter marks greater than 20  because here i am considering outoff marks is 20 only");
                return;
            }
            studentMarks[i] = marks;
        }

        calculateGradeBasedOnTotalMarks(studentMarks);
    }
}
