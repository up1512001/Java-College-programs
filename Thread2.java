
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this,"Demo Thread");
        System.out.println("Child Thread :"+t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread :"+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Thread Interrupted...");
        }
        System.out.println("Exiting From Child Thread...");
    }
}

class Thread2 {

    public static void main(String[] args) {
        new NewThread();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread :"+i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted...");
        }
        System.out.println("Exiting From Main Thread...");
    }
}