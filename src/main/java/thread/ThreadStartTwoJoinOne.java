package thread;

public class ThreadStartTwoJoinOne {
    public static void main(String[] args)throws InterruptedException {
        Thread thread=new Thread(() -> {
            System.out.println("test");
        });
        thread.start();
        thread.join();
        thread.start();
        //Thread можно запустить только 1 раз. После завершения своей задачи он переходит в состояние TERMINATED
        //thread.start();
    }
}
