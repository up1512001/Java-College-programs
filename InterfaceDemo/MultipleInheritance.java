package InterfaceDemo;

public class MultipleInheritance implements p1,s1 {
    public void print(){
        System.out.println("From p1 interface");
    }
    public void show(){
        System.out.println("From s1 interface");
    }
    public static void main(String[] args){
        MultipleInheritance o = new MultipleInheritance();
        o.print();
        o.show();

    }
}
