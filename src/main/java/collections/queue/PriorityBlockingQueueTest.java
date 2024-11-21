package collections.queue;

import java.util.concurrent.PriorityBlockingQueue;

import static java.lang.Thread.sleep;

public class PriorityBlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        //PriorityBlockingQueue является блокирующей.
        //Если очередь пуста, поток, пытающийся извлечь элемент,
        // будет блокирован до тех пор, пока другой поток не вставит элемент.
        PriorityBlockingQueue<Integer> priorityBlockingQueue=new PriorityBlockingQueue<>();


        priorityBlockingQueue.add(10);
        priorityBlockingQueue.add(15);
        priorityBlockingQueue.add(20);
        priorityBlockingQueue.add(1);
        priorityBlockingQueue.add(4);
        int i=0;
        while (!priorityBlockingQueue.isEmpty()){

            System.out.println(priorityBlockingQueue.poll());
            if(priorityBlockingQueue.poll()!=null)
            System.out.println(priorityBlockingQueue.poll());
            priorityBlockingQueue.add(i);
            i++;
            sleep(200);
        }
    }
}
