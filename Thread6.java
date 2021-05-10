
class table{
    synchronized void printtable(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n+"x"+i+"="+n*i);
            try{
                Thread.sleep(300);
            }catch (Exception e){
                System.out.println("Exception Occur is :"+e);
            }
        }
    }
}
class ThreadTable1 extends Thread{
    table t;
    ThreadTable1(table t){
        this.t = t;
    }
    public void run(){
        t.printtable(49);
    }
}
class ThreadTable2 extends Thread{
    table t;
    ThreadTable2(table t){
        this.t = t;
    }
    public void run(){
        t.printtable(23);
    }
}
class Thread6{
    public static void main(String[] args) {
        table t1 = new table();
        ThreadTable1 t2 = new ThreadTable1(t1);
        ThreadTable2 t3 = new ThreadTable2(t1);

        t2.start();
        t3.start();
    }
}