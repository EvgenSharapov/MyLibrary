package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest1 {
    private static void sumAll(int i,int j){
        int sum = 0;
        for (int x = i; x <= j; x++) {
            sum += x;
            System.out.println(sum);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.printf("Сумма чисел от %d до %d: %d",i,j,sum);

    }



    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable sumTask = () -> sumAll(1,100);

        executorService.submit(sumTask);

        executorService.shutdown();
    }
}
