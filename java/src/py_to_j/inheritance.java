package py_to_j;

class Animal{
    public String name;
    public void SetName(String name){
        this.name = name;
    }
    public String GetName(){
        return name;
    }
}

class Dog extends Animal{
    public String sound;
    public void SetSound(String sound){
        this.sound = sound;
    }
    public String GetSound(){
        return sound;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog shimmy = new Dog();

        shimmy.SetName("Shimmy");
        System.out.println(shimmy.GetName());

        shimmy.SetSound("Bark");
        System.out.println(shimmy.GetSound());
    }
}
