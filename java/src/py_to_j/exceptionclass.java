package py_to_j;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString()+" I am toString()";
    }

    @Override
    public String getMessage(){
        return super.getMessage()+" I am getMessage()";
    }
}

class  MyAgeException extends Exception{
    @Override
    public String toString(){
        return super.toString()+" Age cannot be greater than 125";
    }

    @Override
    public String getMessage(){
        return super.getMessage()+" Make Sure that the value of age entered is correct";
    }
}
public class exceptionclass {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a<10){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
