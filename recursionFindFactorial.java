import java.util.Scanner;
class factorial{
    int num;
    factorial(int n){
        this.num = n;
    }
    long fact(int f){
        if(f == 0 || f == 1) return 1;
        else return fact(f-1)*f;
    }
}

class recursionFindFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        factorial f = new factorial(s.nextInt());
        System.out.println("Factorial of "+f.num+" is "+f.fact(f.num));
    }
}