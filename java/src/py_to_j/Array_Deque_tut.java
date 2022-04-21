package py_to_j;
import java.util.*;

public class Array_Deque_tut {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(1);
        ad.add(2);
        ad.add(3);
        System.out.println(ad);
        ad.addFirst(4);
        System.out.println(ad);
        ad.offerFirst(5);// add at first
        System.out.println(ad);

        ad.addLast(6);
        System.out.println(ad);
        ad.offerLast(7);
        System.out.println(ad);

        System.out.println(ad.getFirst());
        System.out.println(ad.peekFirst());

        System.out.println(ad.getLast());
        System.out.println(ad.peekLast());

        ad.removeFirst();// throws an exception if empty
        System.out.println(ad);
        ad.pollFirst();//return null if empty
        System.out.println(ad);

        ad.removeLast();
        System.out.println(ad);
        ad.pollLast();
        System.out.println(ad);


    }
}
