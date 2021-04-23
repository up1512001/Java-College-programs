package InterfaceDemo;

import java.util.Scanner;

public class car implements Demo {
    public void area(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius:");
        int x = s.nextInt();
        System.out.println("Area of circle is of "+x+" radius is "+3.14*x*x);
    }
    public static void main(String[] args){
        car c = new car();
        c.area();
        c.def();
    }
}
