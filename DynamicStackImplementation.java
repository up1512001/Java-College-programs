import java.util.Stack;
//import java.util.Scanner;
interface IntStack{
    void push(int x);
    int pop();
}

class stack implements IntStack{
    int[] s;
    int top;
    public void Initialize(int size){
        s = new int[size];
        top=-1;
    }
    @Override
    public void push(int x) {
        if(top==s.length-1){
            System.out.println("Stack Overflow...");
        }else{
            s[++top]=x;
        }
    }

    @Override
    public int pop() {
        if(top==-1){
            System.out.println("Stack Underflow...");
            return -1;
        }
        int temp=s[top];
        top--;
        return temp;
    }
    public void dis(){
        for(int i=0;i<=top;i++){
            System.out.print(s[i]+" ");
        }
        System.out.print("\n");
    }
}

class DynamicStackImplementation {
    public static void main(String[] args) {
//        Stack<Integer> s;
        stack s = new stack();
        s.Initialize(5);
        System.out.println(s.pop());
        s.dis();
        s.push(1);
        s.push(2);
        s.push(3);
        s.dis();
        s.push(4);
        s.push(5);
        s.push(6);
        s.dis();

        DynamicStackImplementation d = new DynamicStackImplementation();
        d.s();
    }
    public void s(){
//        Scanner s = new Scanner(System.in);
//        int size = s.nextInt();
        Stack<Integer> a = new Stack<>();
        a.push(10);
        System.out.println(a.pop());
//        System.out.println(a.pop());
//        above line throws an exception
        System.out.println(a.empty());
    }
}