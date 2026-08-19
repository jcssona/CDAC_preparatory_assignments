package assignemntprograms;

import java.util.Scanner;

public class NumberSystemConversion {
    static String toBinary(int num) {
        if (num == 0)
            return "0";

        String result = "";

        while (num > 0) {
            int remainder = num % 2;
            result = remainder + result;
            num = num / 2;
        }

        return result;
    }

    static String toOctal(int num) {
        if (num == 0)
            return "0";

        String result = "";

        while (num > 0) {
            int remainder = num % 8;
            result = remainder + result;
            num = num / 8;
        }

        return result;
    }

    static String toHexadecimal(int num) {
        if (num == 0)
            return "0";

        String result = "";
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (num > 0) {
            int remainder = num % 16;
            result = hex[remainder] + result;
            num = num / 16;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Binary equivalent      : " + toBinary(num));
            System.out.println("Octal equivalent       : " + toOctal(num));
            System.out.println("Hexadecimal equivalent : " + toHexadecimal(num));
        }

        sc.close();
    }
}
