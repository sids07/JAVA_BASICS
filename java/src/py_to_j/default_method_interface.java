package py_to_j;

import java.util.Arrays;

interface GPS{
    void location();
    private void name(){
        System.out.println("Hi");
    }
    default void tracker(){
        System.out.println("I am tracking");
        name();
    }
}

interface Web{
    void DefaultWeb();
    String[] Networks();
}

class CellPhone{
    public void Release(){
        System.out.println("Releasing");
    }
}

class SmartPhone extends CellPhone implements Web,GPS{
    public void location(){
        System.out.println("Getting Location");
    }
    public void DefaultWeb(){
        System.out.println("Brave");
    }
    public String[] Networks(){
        System.out.println("Getting list of Networks");
        String[] NetworkList;
        NetworkList = new String[]{"Chrome","Mozilla","Safari"};
        return NetworkList;
    }
}

public class default_method_interface {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        String[] net = sp.Networks();
        System.out.println(Arrays.toString(net));

        sp.Release();
        sp.tracker();

    }
}
