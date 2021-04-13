package p2;
import p1.Protection;
public class Subclass extends Protection{
    Subclass(){
        System.out.println("Subclass Of Different Package");
//        System.out.println("Default value:"+a);
//        System.out.println("Private Value:"+b);
        System.out.println("Protected Value:"+c);
        System.out.println("Public Value:"+d);
    }
}
