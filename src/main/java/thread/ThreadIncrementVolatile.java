package thread;

public class ThreadIncrementVolatile {
    private volatile int count=0;
    public synchronized void increment(){count++;}
    public int getCount(){return count;}

    public static void main(String[] args) throws InterruptedException {
        ThreadIncrementVolatile threadIncrement=new ThreadIncrementVolatile();
        Thread t1=new Thread(threadIncrement::increment);
        Thread t2=new Thread(threadIncrement::increment);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(threadIncrement.getCount());

    }
}
