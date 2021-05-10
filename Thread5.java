class Thread5 extends Thread {
    public static void main(String[] args) {
        Thread5 t1 = new Thread5();
        Thread5 t2 = new Thread5();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }

    public void run(){
        System.out.println("Thread is :"+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+" priority :"+Thread.currentThread().getPriority());
    }
}