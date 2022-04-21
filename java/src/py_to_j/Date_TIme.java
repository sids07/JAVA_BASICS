package py_to_j;

import java.util.Date;

public class Date_TIme {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println(Long.MAX_VALUE);

        Date d = new Date();
        System.out.println(d);

        Date d1 = new Date(1650282075403L);
        System.out.println(d1);

        Date d3 = new Date(2021,12,24);
        System.out.println(d3);

        System.out.println(d.compareTo(d3));
        System.out.println(d3.getTime());

    }
}
