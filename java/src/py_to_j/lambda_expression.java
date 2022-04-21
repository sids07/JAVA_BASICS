package py_to_j;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}
public class lambda_expression {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);

        ar.forEach((n)->{
            System.out.println(n);
        });

        /*
        Lambda can be stored in variables if the variables's type is an interface which has only one method.
         */
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };

        ar.forEach(method);

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        printFormatted("Hello",exclaim);
        printFormatted("Hello",ask);

    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
