import java.util.Scanner;

class test{
    int a;
    public int b;
    private int c;
    // c has private access to test class
    test(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void printc(test t){
        System.out.println("private "+t.c);
    }
    void setc(int c){
        this.c=c;
    }
    int getc(){
        return c;
    }
    test(){
        a=0;
        b=0;
        c=0;
    }
}

class accessControl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int size = s.nextInt();
        test t = new test();
        t.a=20;
        t.b=30;
        t.setc(40);
        System.out.println("default "+t.a+" public "+t.b+" private "+ t.getc());
    }
}