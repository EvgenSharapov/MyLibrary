package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAtomicInteger {
    private static final AtomicInteger counter=new AtomicInteger(0);
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++){
                synchronized (counter){
                System.out.print(counter.incrementAndGet()+" ");}
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
                synchronized (counter){
                System.out.print(counter.incrementAndGet()+" ");}
            }
        });
        t1.start();
        t2.start();

    }
}
//без блока synchronized не гарантирован вывод чисел в порядке возрастания