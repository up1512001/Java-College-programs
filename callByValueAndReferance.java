import java.util.Scanner;
class  test{
    int a,b;
    test(int a,int b){
        this.a=a;
        this.b=b;
    }
    void m(test t){
        t.a*=2;
        t.b/=2;
    }
    void m(int i,int j){
        i*=2;
        j/=2;
        System.out.println("i and j value:"+i+" "+j);
    }
}
class callByValueAndReferance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt();
        test t = new test(a,b);

        System.out.println("Before:"+a+" "+b);
        System.out.println("Before:"+t.a+" "+t.b);
        t.m(a,b);
        t.m(t);
        System.out.println("after:"+a+" "+b);
        System.out.println("after:"+t.a+" "+t.b);
    }
}