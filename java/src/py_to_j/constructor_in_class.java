package py_to_j;

class Parents{
    Parents(){
        System.out.println("This is the default constructor of parents");
    }
    Parents(int age){
        System.out.println("This is the parameterized constructor of parents with age"+age);
    }
}

class Child extends Parents{
    Child(){
        System.out.println("This is the default constructor of child");
    }
    Child(int age, int year){
        super(age);
        System.out.println("This is the parameterized constructor of child whith year"+ year);
    }
}

/*
super is used to let the program tell which constructor to used when multiple construction is available in the class.
i.e. super() == constructor with no parameters in parent class
     super(a) == constructor with single parameters in parent class,.... etc
 */

class GrandChild extends Child{
    GrandChild(){
        System.out.println("THis is main");
    }
    GrandChild(int a, int b, int c){
        super(a,b);
        System.out.println("This is main parameterized with c" +c);
    }
}
public class constructor_in_class {
    public static void main(String[] args) {
        System.out.println("Without parameters");
        GrandChild gcm = new GrandChild();
        System.out.println("With Parameters");
        GrandChild gc = new GrandChild(10,12,13);
    }
}
