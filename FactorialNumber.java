package assignemntprograms;

import java.util.Scanner;

public class FactorialNumber {

    public static int factorial(int number)
    {
        int ans = 1;
        for(int i=1;i<=number;i++)
        {
            ans = ans * i;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int number;
        System.out.print("Enter a number : ");
        number = sc.nextInt();

        if(number < 0)
        {
            System.out.println("You cant find the factorial of negative number !! Please enter a positive number");
            return;
        }

        System.out.println("Factorial of a number is : "+factorial(number));

    }
}
