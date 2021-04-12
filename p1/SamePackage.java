package p1;

public class SamePackage{
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Same Package Class Constructor...");
        System.out.println("Default value:"+p.a);
//        System.out.println("Private Value:"+p.b);
        System.out.println("Protected Value:"+p.c);
        System.out.println("Public Value:"+p.d);
    }
}
