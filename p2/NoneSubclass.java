package p2;
import p1.Protection;
public class NoneSubclass {
    NoneSubclass(){
        Protection p = new Protection();
        System.out.println("NoneSubclass Of Different Package");
//        System.out.println("Default value:"+p.a);
//        System.out.println("Private Value:"+p.b);
//        System.out.println("Protected Value:"+p.c);
        System.out.println("Public Value:"+p.d);
    }
}
