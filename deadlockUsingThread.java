
class A{
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name+"Entered A.foo");

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Got ->"+e);
        }
        System.out.println(name +" trying to call B.last() method");
        b.last();
    }
    synchronized void last(){
        System.out.println("Inside A.last method");
    }
}

class B{
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name +" entered B.bar");

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Got ->"+e);
        }
        System.out.println(name + " trying to call A.last method");
        a.last();
    }
    synchronized void last(){
        System.out.println("Inside B.last method");
    }
}

class deadlockUsingThread implements Runnable{
    A a = new A();
    B b = new B();

    deadlockUsingThread(){
        Thread.currentThread().setName("Main Thread");
        Thread t = new Thread(this,"Racing Thread");
        t.start();

        a.foo(b);
        System.out.println("Back in Main Thread");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back in Other Thread");
    }

    public static void main(String [] args){
        new deadlockUsingThread();
    }
}