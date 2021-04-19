import java.util.Scanner;
interface i{
//    int x = 0;
    void area();
    default void def(){
        System.out.println("Hello from interface");
    }
}
class cir implements i{
    public void area(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius:");
        int x = s.nextInt();
        System.out.println("Area of circle is of "+x+" radius is "+3.14*x*x);
    }
}
class rec implements i{
    public void area(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and width:");
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println("Area of Rectangle is :"+x*y);
    }
}
class InterfaceDemo2{
    public static void main(String[] args) {
        cir c = new cir();
        c.area();
        rec r = new rec();
        r.area();
        c.def();
        r.def();
        // below code also give same above output
//        i a = new rec();
//        a.area();
//        i b = new cir();
//        b.area();
    }
}