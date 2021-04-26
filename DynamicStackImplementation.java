//import java.util.Stack;

interface IntStack{
    void push(int x);
    int pop();
}

class stack implements IntStack{
    int s[];
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
        System.out.println("");
    }
}

class DynamicStackImplementation {
    public static void main(String[] args) {
//        Stack<Integer> s;
        stack s = new stack();
        s.Initialize(5);
        s.pop();
        s.dis();
        s.push(1);
        s.push(2);
        s.push(3);
        s.dis();
        s.push(4);
        s.push(5);
        s.push(6);
        s.dis();
    }
}