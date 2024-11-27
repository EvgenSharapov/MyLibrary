package thread;

public class MyThreadTest1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Hello from MyThread!");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThreadTest1 test1=new MyThreadTest1();
        MyThreadTest1 test2=new MyThreadTest1();
        test1.start();
        test2.start();

    }
}
