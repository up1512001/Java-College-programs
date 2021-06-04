

class Query{
    int n;
    boolean flag = false;
    synchronized int get() {
        if(!flag)
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got: " + n);
        flag = false;
        notify();
        return n;
    }
    synchronized void put(int n) {
        if(flag)
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        this.n = n;
        flag = true;
        System.out.println("Put: " + n);
        notify();
    }
}


class Producer implements Runnable {
    Query q;
    Producer(Query q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Query q;
    Consumer(Query q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while(true) {
            q.get();
        }
    }
}
class Thread6ProducerConsumerProblem_2 {
    public static void main(String[] args) {
        Query q = new Query();
        new Producer(q);
        new Consumer(q);

        System.out.println("Producer Consumer Program");
    }
}
