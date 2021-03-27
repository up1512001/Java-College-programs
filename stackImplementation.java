
class stack{
    int top;
    int[] obj = new int[5];
    stack(){
        top=-1;
    }
    void push(int data){
        if(top==4){
            System.out.println("Stack Overflow...");
            return;
        }
        obj[++top]=data;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack Underflow...");
            return -1;
        }
        int ret = obj[top];
        top--;
        return ret;
    }
    boolean search(int data){
        if(top==-1){
            System.out.println("Stack Underflow...");
            return  false;
        }
        for(int i=0;i<=top;i++){
            if(obj[i]==data){
                return true;
            }
        }
        return false;
    }
    void dis(){
        if(top==-1){
            System.out.println("Stack Underflow...");
            return ;
        }
        for(int i=0;i<=top;i++){
            System.out.print(obj[i]+" ");
        }
        System.out.println();
    }
}


class stackImplementation {
    public static void main(String[] args) {
        stack s =  new stack();
        s.pop();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.dis();
        s.push(50);
        s.dis();
        System.out.println("Found or not:"+s.search(20));
        s.push(60);
        s.dis();
    }
}