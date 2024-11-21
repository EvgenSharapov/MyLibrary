package thread;

public class ThreadTwoStartOneJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            System.out.println("test");
        });
        thread.start();
//        thread.join();
//        thread.start();//нельзя два раза вызывать метод
        thread=new Thread(()->{
            System.out.println("test");
        });
        thread.start();
    }
}
