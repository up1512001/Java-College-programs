package InterfaceDemo;

public class MultipleInheritance2 implements p2{
    @Override
    public void print() {
        System.out.println("From p1 Interface");
    }
    @Override
    public void show(){
        System.out.println("From s1 interface");
    }
    public static void main(String[] args){
        MultipleInheritance2 a = new MultipleInheritance2();
        a.print();
        a.show();
    }
}
