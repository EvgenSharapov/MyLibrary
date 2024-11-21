package thread;

public class TwoThreadStartVsRun extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new TwoThreadStartVsRun());
        Thread t2=new Thread(new TwoThreadStartVsRun());

        t1.start();
        t2.start();
        sleep(2000);
        t1.run();
        t2.run();

    }
    public void run(){
        for(int i=0;i<4;i++){
            System.out.print(i);
            try{
                sleep(200);
            }catch (InterruptedException e){e.printStackTrace();}
        }
    }

}
