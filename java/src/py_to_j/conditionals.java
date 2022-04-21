package py_to_j;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        /*
        IF-ELSE Statement.
         */

        if (a>30) {
            System.out.format("The given number %d is above 30",a);
        }
        else {
            System.out.format("The given number %d is below 30",a);
        }

        boolean x = true;
        boolean y = false;

        System.out.println("Entering Logical AND ...");
        if (x&&y){
            System.out.println("AND operation gives true");
        }
        else{
            System.out.println("AND operation is giving false");
        }

        /*
        SWITCH CASE
         */
        System.out.println("Switch Case Control");
        Scanner sc1 = new Scanner(System.in);
        String ss = sc1.nextLine();
        /*
        switch requires break after each case otherwise every other case after our matched case will also be executed.
         */
        switch (ss){
            case "Sid":{
                System.out.println("Hello Sid");
                System.out.println("Check");
                break;
            }
            case "Sudan":
                System.out.println("Hello Sudan");
                break;
            case "Manish":
                System.out.println("Hello Manish");
                break;
            default:
                System.out.println("Invalid Name to switch case");
        }

        int i = 12;
        while (i>10){
            System.out.println(i);
            i--;
        }

        int j=1;
        do{
            System.out.println(j);
            j++;
        }while (j<=4);

        /*
        for(initialize; check boolean_expression; update)
         */
        for(int k=1; k<=7; k++){
            System.out.println(k);
        }
    }
}
