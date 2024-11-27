package thread;

public class MyRunnableTest1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnableTest1());
        Thread thread2 = new Thread(new MyRunnableTest1());
        Thread thread3 = new Thread(new MyRunnableTest1());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
