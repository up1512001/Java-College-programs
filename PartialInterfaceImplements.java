
interface myInter{
    void callBack(int x);
    void show();
}

interface s1{
    void theory();
    void practical();
}
abstract class pr implements s1{
    @Override
    public void theory() {
        System.out.println("This is theory method...");
    }
}
class theo extends pr{
    @Override
    public void practical() {
        System.out.println("This is practical method...");
    }
}
class PartialInterfaceImplements implements myInter {
    int x=49,y=194;
    @Override
    public void show() {
        System.out.println("value of x:"+x+" value of y:"+y);
    }

    @Override
    public void callBack(int x) {
        System.out.println("This is callBack method... value of x:"+x);
    }

    public static void main(String[] args) {
        theo p = new theo();
        p.theory();
        p.practical();
        PartialInterfaceImplements a = new PartialInterfaceImplements();
        a.show();
        a.callBack(30);
    }
}

