package py_to_j;

abstract class Parent{
    Parent(){
        System.out.println("Parent's Constructor");
    }
    abstract public void greet();
    abstract public void call();
}

class Child1 extends Parent{
    Child1(){
        System.out.println("Child's Constructor");
    }
    @Override
    public void greet(){
        System.out.println("Namaste Mummy Papa");
    }
    @Override
    public void call(){
        System.out.println("Calling Parents by Child");
    }
}
public class AbstractClassMethod {
    public static void main(String[] args) {
        Child1 TestChild = new Child1();
        TestChild.greet();
        TestChild.call();
    }
}
