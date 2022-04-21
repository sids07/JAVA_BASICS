package py_to_j;
import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        ll.set(1,11);
        System.out.println(ll);
        ll.addFirst(0);
        System.out.println(ll);
        ll.addLast(9);
        System.out.println(ll);
    }
}
