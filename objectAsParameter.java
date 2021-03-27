import java.util.Scanner;
class test{
    int a,b;
    test(int a,int b){
        this.a=a;
        this.b=b;
    }
    boolean equal(test t){
        return t.a == a && t.b == b;
    }
}

class objectAsParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test t1 = new test(sc.nextInt(),sc.nextInt());
        test t2 = new test(sc.nextInt(),sc.nextInt());
        test t3 = new test(sc.nextInt(),sc.nextInt());
        System.out.println("t1 is Equal to T2:"+t1.equal(t2));
        System.out.println("t1 is equal to t3:"+t1.equal(t3));
    }
}