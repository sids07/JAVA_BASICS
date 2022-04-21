package py_to_j;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Primitive (for storing simple values such as numbers, characters, booleans)
        // there are 8 primitive data types in java shown below and all other are references
        byte age = 30;

        short ageShort = 333;

        int randomNumber = 300_000;
        // We can use _ to make the integer more readable

        long viewsCount = 3_123_456_789L;
        // By default java assumes the above number to be integer but since it exceeds the int limit we have to use long
        // And to let the java know that the number is long we can use L or l after the number.

        double price = 10.99;

        float priceIncreased = 111.999F;
        // Similarly java assumes the decimal number to be double and to let it know it is float we have to use F or f.

        char letter = 'A';
        // ' ' for single alphabet and " " for strings.

        boolean isEligible = false;

        // Reference type i.e. for storing complex values like date objects or mail messages etc
        Date now = new Date();
        // while initializeing the reference data type we must allocate a memory i.e. using new but for primitive java runtime allocates and releases the memory.
        // we don't need to release this memory as java runtime will automatically take care of them.

        System.out.println(randomNumber);
        System.out.println(now);

    }
}
