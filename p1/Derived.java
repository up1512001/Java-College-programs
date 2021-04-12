package p1;

public class Derived extends Protection {
    Derived(){
        System.out.println("Derived class Constructor...");
        System.out.println("Default value:"+a);
//        System.out.println("Private Value:"+b);
        System.out.println("Protected Value:"+c);
        System.out.println("Public Value:"+d);
    }
}
