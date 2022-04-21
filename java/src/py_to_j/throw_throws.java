package py_to_j;

class NegativeRadiusError extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative must be greater than or equal to 0";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative must be greater than or equal to 0";
    }
}

public class throw_throws {
    public static double area(int r) throws NegativeRadiusError{
        if (r<0){
            throw new NegativeRadiusError();
        }
        double result = Math.PI *r *r;
        return result;
    }

    public static void main(String[] args) {
        try{
            double ar = area(-6);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
