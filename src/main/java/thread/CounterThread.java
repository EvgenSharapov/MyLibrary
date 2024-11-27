package thread;

public class CounterThread implements Runnable{
    private volatile int count;

    private synchronized void increment(){
        System.out.println("Увеличиваю count");
        count++;
    }
    private synchronized int getCount(){
        System.out.println("Получаю count:"+count);
        return count;
    }

    public static void main(String[] args) {
        CounterThread counterThread=new CounterThread();
       Thread thread1=new Thread(counterThread);
       Thread thread2=new Thread(counterThread);
        thread1.start();
        thread2.start();
    }
    @Override
    public void run() {
        int i=0;
while (true) {
    increment();
    getCount();
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        System.out.println("Поток прерван");
        break;
    }

        if(i==10){Thread.currentThread().interrupt();}
        i++;


}
    }
}
