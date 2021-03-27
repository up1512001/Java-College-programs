import java.util.Scanner;

class test{
    int a;
    test(int a){
        this.a=a;
    }
    test incrbyten(){
        return new test(a+10);
    }
}


class returnClassObject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        test t1 = new test(s.nextInt());
        test t2;
        System.out.println("Original value:"+t1.a);
      //  System.out.println(t2.a);
        t2=t1.incrbyten();
        System.out.println("incremented by 10 value:"+t2.a);
        System.out.println("Original value:"+t1.a);
    }
}