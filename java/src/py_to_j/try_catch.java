package py_to_j;

public class try_catch {
    public static void main(String[] args) {
        int a = 200;
        int b = 0;

        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception with following reason");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("We failed due to following reason: ");
            System.out.println(e);
        }
    }
}
