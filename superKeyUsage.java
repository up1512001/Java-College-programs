// super key use
import java.util.Scanner;
class animal{
    String color = "White";
    void eat(){
        System.out.println("Animal is Eating...");
    }
    void run(int x){
        System.out.println("Animal is running at "+x+"km/h speed");
    }
}
class dog extends animal{
    String color = "Gray";
    void disColor(){
        System.out.println("The color of dog:"+color);
        // parent class color accessing
        System.out.println("The color of animal:"+super.color);
    }
    void eat(){
        System.out.println("Dog is Eating...");
    }
    void bark(){
        System.out.println("Dog is Barking...");
    }
    void dis(int x){
        eat();
        super.eat();
        disColor();
        bark();
        super.run(x);
    }
}
class superKeyUsage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        dog d = new dog();
        d.dis(s.nextInt());
    }
}