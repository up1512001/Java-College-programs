// controlling main thread
class Thread1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread:"+t);

        // change name of thread
        t.setName("My thread 1");
        System.out.println("After name Change :"+t);

        try{
            for(int n=5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
}