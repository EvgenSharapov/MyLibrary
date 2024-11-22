package thread;

public class HundredThreads {
    public static void main(String[] args) {
        A a=new A();
        for (int i=0;i<100;i++){
            new Thread(a).start();
        }

    }
}
class A implements Runnable{
    private int i;
    @Override
    public void run() {

        if(i%5!=0)i++;
        for(int x=0;x<5;x++,i++){
            if(x>1)Thread.yield();
        }
        System.out.println(i);

    }
}
