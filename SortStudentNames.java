package assignemntprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortStudentNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> studNames = new ArrayList<>();

        int n;
        System.out.print("Enter how many students you need as an input : ");
        n = sc.nextInt();

        sc.nextLine();
        String name;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter student name : ");
            name = sc.nextLine();
            studNames.add(name);
        }

        System.out.println("Student list before sorting");

        for(int i=0;i<studNames.size();i++)
        {
            System.out.print(studNames.get(i)+" ");
        }


        studNames.sort(Comparator.naturalOrder());

        System.out.println("Student list after sorting ");

        for(int i=0;i<studNames.size();i++)
        {
            System.out.print(studNames.get(i)+" ");
        }

    }
}
