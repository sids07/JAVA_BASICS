package py_to_j;
class A{
    public void check(){
        System.out.println("Checking for base class");
    }
    public void testA(){
        System.out.println("Method only on Parents class");
    }
}

class B extends A{
    @Override
    public void check(){
        System.out.println("Checking for child class");
    }

    public void testB(){
        System.out.println("Method only on Child class");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        B b = new B();
        b.check();

        // Dyanamic Method Dispatch

        A bb = new B();
        bb.check(); //will invoke check of B as it is overridden
        bb.testA(); // allowed since we have initialized it as A
//        bb.testB(); //not allowed
    }
}
