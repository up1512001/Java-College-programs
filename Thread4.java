
class NewThread implements Runnable{
    Thread t;
    NewThread(String s){
        t = new Thread(this,s);
        System.out.println(t.getName()+" :"+t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(t.getName()+" :"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(t.getName()+" Interrupted...");
        }
        System.out.println("Exiting From "+t.getName()+"...");
    }
}

class Thread4 {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        try{
            Thread.sleep(10000);
//            System.out.println("Process Starts::->");


        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted...");
        }
        System.out.println("Exiting From Main Thread...");
    }
}