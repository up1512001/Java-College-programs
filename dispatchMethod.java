//import java.util.Optional;

class A{
    void call(){
        System.out.println("Called from A class");
    }
}
class B extends A{
    void call(){
        System.out.println("Called from B class");
    }
}
class C extends A{
    void call(){
        System.out.println("Called from C class");
    }
}


class dispatchMethod {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        // for class A
        A r;
        r = a;
        r.call();
        // for class B
        r = b;
        r.call();
        // for class C
        r = c;
        r.call();
    }
}