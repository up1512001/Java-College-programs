import java.util.Scanner;
class test{
    int a;
    test(){
        this.a=100;
    }
    void dis(){
        System.out.println("Value of A:"+a);
    }
}
class classMethodWithoutParameter {
    public static void main(String[] args) {
        test t1 = new test();
        t1.dis();
    }
}