package assignemntprograms;

import java.util.Scanner;

public class MultiplicationTables {

    public static void printTables(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(num * i+" ");
        }
        System.out.println();
    }


    public static void printTablesBasedOnStartAndStop(int num1,int num2)
    {
        for(int i=num1;i<=num2;i++)
        {
            printTables(i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        System.out.print("Enter a number1 : ");
        number1 = sc.nextInt();
        int number2;
        System.out.print("Enter a number2 : ");
        number2 = sc.nextInt();

        printTablesBasedOnStartAndStop(number1,number2);
    }
}
