// single level inheritance by a and b class
// multilevel inheritance by a b and c class
class a{
    void p1(){
        System.out.println("Hello from A class");
    }
}
class b extends a{
    void p2(){
        System.out.println("Hello from B class");
    }
}
class c extends b{
    void p3(){
        System.out.println("Hello From C class");
    }
}
class inheritance {
    public static void main(String[] args) {
        c b1 = new c();
        b1.p3();
        b1.p2();
        b1.p1();
    }
}