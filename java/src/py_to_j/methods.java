package py_to_j;

public class methods {
    /*
    static = makes method associated with this class itself not to the object of the class.
     static method in a class is shared by all the objects.
     if no static given, it creates copy of this method for each object initialized from this class.
     */
    static int logic(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        /*
        if no static is given:
        methods obj = new methods();
        c = obj.logic(a,b)
         */
        c = logic(a,b);
        System.out.println(c);
    }
}
