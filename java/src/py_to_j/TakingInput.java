package py_to_j;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the Keyboard");
        Scanner sc = new Scanner(System.in);
        // For getting user input, we use Scanner class from java utils

        System.out.println("Enter number 1");
        int a  = sc.nextInt();
        float a_float = sc.nextFloat();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        float b_float = sc.nextFloat();
        int sum = a+b;
        System.out.println("The sum of int numbers is:");
        System.out.println(sum);

        float sum_float = a_float+b_float;
        System.out.println("The sum of floating numbers is:");
        System.out.println(sum_float);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str = sc.next();
        // Reads only first word until first whitespace
        System.out.println(str);

        String str_again = sc.nextLine();
        System.out.println(str_again);
    }
}
