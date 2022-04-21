package py_to_j;
interface interfaceA{
    void method1();
    void method2();
}
interface interfaceB extends interfaceA{
    void method3();
    void method4();
}
class testA implements interfaceB{
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Method 2");
    }
    public void method3(){
        System.out.println("Method 3");
    }
    public void method4(){
        System.out.println("Method 4");
    }
}
public class inheritance_interface {
    public static void main(String[] args) {
        testA test = new testA();
        test.method1();
        test.method2();
        test.method3();
        test.method4();
    }
}
