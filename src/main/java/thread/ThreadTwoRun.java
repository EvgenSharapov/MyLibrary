package thread;

public class ThreadTwoRun extends Thread{
    ThreadTwoRun(){
        System.out.print("MyThread");
    }
    public void run(){
        System.out.print(" bar");
    }
    public void run(String s){
        System.out.print(" baz");
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        Thread t=new ThreadTwoRun() {public void run(){
            System.out.println(" foo");
        }};

        t.start();
    }
}
