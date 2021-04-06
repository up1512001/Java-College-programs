
class fig{
    double d1,d2;
    fig(double d1,double d2){
        this.d1=d1;
        this.d2=d2;
    }
    double area(){
        System.out.println("Area Undefined...");
        return 0;
    }

}
class rec extends fig{
    rec(double d1,double d2){
        super(d1,d2);
    }
    double area(){
        System.out.println("Inside Area of Rectangle.");
        return d1*d2;
    }
}
class tri extends fig{
    tri(double d1,double d2){
        super(d1,d2);
    }
    double area(){
        System.out.println("Inside Area Of Triangle");
        return (d1*d2)/2;
    }
}
class dynamicDispatch {
    public static void main(String[] args) {
//        rec r = new rec(20,30);
//        System.out.println(r.area());
//
//        tri t = new tri(30,40);
//        System.out.println(t.area());
//
//        fig f = new fig(30,35);
//        System.out.println(f.area());
        fig f = new fig(10,20);
        rec r = new rec(10,20);
        tri t = new tri(10,20);
        fig a;
        a=f;
        System.out.println(a.area());
        a=r;
        System.out.println(a.area());
        a=t;
        System.out.println(a.area());
    }
}