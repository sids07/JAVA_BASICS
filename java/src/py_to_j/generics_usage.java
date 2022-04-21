package py_to_j;

import java.util.ArrayList;

class MyGenerics<T1, T2>{
    int val=333;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
    public T2 getT2(){
        return t2;
    }

    public void setT2(T2 t2){
        this.t2 = t2;
    }
    public T1 getT1(){
        return t1;
    }

    public void setT1(T1 t1){
        this.t1 = t1;
    }

    public int getVal(){
        return val;
    }
    public void setVal(int val){
        this.val = val;
    }
}
public class generics_usage {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();

        al.add(11);
        al.add(12);
        al.add(13);

        int a = al.get(0);

        MyGenerics<String, Integer> g1 = new MyGenerics(33,"My", 77);

        String str = g1.getT1();
        int inp = g1.getT2();

        System.out.println(str+inp);

    }
}
