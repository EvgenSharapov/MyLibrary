package thread;

public class NewThreadPrintName extends Thread{
    NewThreadPrintName(){
        super("My Thread");
        start();

    }
    public void run(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        new NewThreadPrintName();
    }
}
