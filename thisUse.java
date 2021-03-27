import java.util.Scanner;

class test{
    int a,b;
    test(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class demo{
    int a,b;
    demo(int a,int b){
        a=a;
        b=b;
    }
}
class thisUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        test t = new test(a, b);
        demo d = new demo(a, b);
        System.out.println("without use of THIS :"+d.a+" "+d.b);
        System.out.println("with use of THIS :"+t.a+" "+t.b);
    }
}