
// we can not change value of variable that is created by final keyword
class a{
    final int i;
    {
        i=49;
    }
    final void display(){
        System.out.println("This is Final Method and i value is :"+i);
    }
}
//class b extends a{
    // through an error
    // final method can not overridden
//    void display(){
//        System.out.println("Without Final key");
//    }
//}
final class air{
    void display(){
        System.out.println("Final class can not inherited");
    }
}
//class q extends air{
//    this will throw an error that can not inherit from final class 'air'
//}
class finalUse {
    public static void main(String[] args) {
        final int x = 20;
        System.out.println("Final Keyword use:"+x);
        a y = new a();
//        b z = new b();
//        z.displa();
        y.display();

        air u = new air();
        u.display();
    }
}