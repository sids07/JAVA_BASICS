package py_to_j;
import java.util.Locale;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        String name = new String("Hello");
        System.out.println(name);

        String nm = "Hello guys";
        System.out.println(nm);

        int a = 6;
        float b = 5.6456f;
        System.out.printf("The value of a is %d and value of b is %f",a,b);

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String rstring = name.toUpperCase();
        System.out.println(rstring);

        String nonTrimmed = "    Sid    ";
        System.out.println(nonTrimmed);
        System.out.println(nonTrimmed.trim());

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('e','f'));
        System.out.println(name.replace("ll","bb"));
        System.out.println(name.replace("l","bb"));
    }
}
