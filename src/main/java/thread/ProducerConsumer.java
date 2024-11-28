package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

public class ProducerConsumer {




    public static void main(String[] args) {
        BlockingQueue<Integer>queue=new LinkedTransferQueue<>();
        Thread producer=new Thread(new Producer(queue));
        Thread consumer=new Thread(new Consumer(queue));
        producer.start();
        consumer.start();

        try{
            producer.join();
            consumer.interrupt();
            consumer.join();
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }
        System.out.println("Работа завершена.");
    }
}
class Producer implements Runnable{
    private final BlockingQueue<Integer> queue;
    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        try {
            for(int i=1;i<=10;i++){
                System.out.println("Добавляем:"+i);
                queue.put(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
class Consumer implements Runnable{
    private final BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    @Override
    public void run() {
        try {
            while (true){
                Integer x=queue.take();
                System.out.println("Берём:"+x);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
