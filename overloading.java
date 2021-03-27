import java.util.Scanner;
class abc{
    void test(){
        System.out.println("No Parameter...");
    }
    long test(long n){
        System.out.println("Long Single parameter:"+n);
        return n;
    }
    float test(float n){
        System.out.println("float single parameter:"+n);
        return n;
    }
    void test(int a,int b){
        System.out.println("Double Parameter :"+a+" "+b);
    }
    double test(double a){
        System.out.println("Double type Single Parameter:"+a);
        return a*a;
    }
}
public class overloading
{
    public static void main(String[] args) {
        //System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);

        abc a1= new abc();
        a1.test();
        a1.test(sc.nextInt());
        a1.test(sc.nextInt(),sc.nextInt());
        System.out.println(a1.test(sc.nextFloat()));
        System.out.println(a1.test(sc.nextInt()));
        System.out.println(a1.test(sc.nextDouble()));


    }
}
