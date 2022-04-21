package py_to_j;

interface Bicycle{
    int id = 2000;
    void price(int value);
    void color(String color);
    static void details(){
        System.out.println("Bicycle Class " + id);
    }
}

class Bmx implements Bicycle{
    int value;
    String color;
    Bmx(){
        System.out.println("BMX Bicycle");
    }
    public int GetPrice(){
        return value;
    }
    public void SetPrice(int value){
        this.value = value;
    }
    public String GetColor(){
        return color;
    }
    public void SetColor(String color){
        this.color = color;
    }
    public void price(int a){
        System.out.println("Price of BMX is "+a);
    }
    public void color(String color){
        System.out.println("Color of BMX is "+color);
    }
}

public class Interface {
    public static void main(String[] args) {
        Bmx bb = new Bmx();

        bb.SetPrice(3000);
        int price = bb.GetPrice();
        bb.price(price);

        bb.SetColor("RED");
        String color = bb.GetColor();
        bb.color(color);
    }
}
