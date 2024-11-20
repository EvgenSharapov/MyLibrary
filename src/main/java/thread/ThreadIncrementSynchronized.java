package thread;

public class ThreadIncrementSynchronized {
    private int count=0;
    //обращение к неволатильным переменным из синхронизированного блока гарантирует видимость, упорядоченность и атамарность
    public synchronized void increment(){count++;}
    public int getCount(){return count;}

    public static void main(String[] args) throws InterruptedException {
        ThreadIncrementSynchronized threadIncrement=new ThreadIncrementSynchronized();
        Thread t1=new Thread(threadIncrement::increment);
        Thread t2=new Thread(threadIncrement::increment);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(threadIncrement.getCount());

    }
}
