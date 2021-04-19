
interface  demo{
    int x=49; // public static final {data type}
    void y();// doesn't have body // public {return type} {method name}
//    {
//        System.out.println("Hello world");
//    }
    // implementation throws error
}

class InterfaceImplement implements demo {
    public void y(){
        System.out.println("Hello world form interface demo");
        System.out.println("Value of X:"+x);
    }
    public static void main(String[] args) {
        //demo d = () -> System.out.println("Hello from area..."+ demo.x);
        // lambda replacement
        InterfaceImplement i = new InterfaceImplement();
        i.y();

    }
}