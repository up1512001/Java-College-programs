// same parent objects
class a{
    void m1(){
        System.out.println("From Parent Class");
    }
}
class b extends a{
    void m2(){
        System.out.println("From Child 1 Class");
    }
}
class c extends a{
    void m3(){
        System.out.println("From Child 2 class");
    }
}

class multipleInheritance {
    public static void main(String[] args) {
        b b1 = new b();
        c c1 = new c();
        b1.m2();
        b1.m1();
        c1.m3();
        c1.m1();
    }
}