package py_to_j;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);

        l1.addAll(l2);

        System.out.println(l1.contains(11));
        System.out.println(l1.indexOf(11));

        for (int i=0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1);
    }

}
