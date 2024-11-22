package thread;

public class ThreadPrintText implements Runnable{
    String x,y;

    public void run() {
for(int i=0;i<10;i++){
    synchronized (this){
        x="Hello";
        y="Java";
        System.out.print(x+" "+y+" ");
    }
}


    }

    public static void main(String[] args) {
        ThreadPrintText threadPrintText=new ThreadPrintText();
        Thread obj1=new Thread(threadPrintText);
        Thread obj2=new Thread(threadPrintText);
        obj1.start();
        obj2.start();
    }
}
