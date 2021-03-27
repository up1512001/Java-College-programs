import java.util.Scanner;

class  cirArea{
    int r;
    cirArea(int r){
        this.r=r;
    }
    double area(cirArea t){
        return t.r*t.r*3.14;
    }
}


class classMethodWithParameterReturnValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        cirArea c = new cirArea(s.nextInt());
        System.out.println("Area of "+c.r+" radius circle is "+c.area(c));
    }
}