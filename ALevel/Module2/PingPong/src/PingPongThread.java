import java.util.Scanner;

public final class PingPongThread implements Runnable {

    private static int num;



    public static void main(String[] args) throws InterruptedException {

        System.out.println("Type until You can...");

        threadCheck();
        while(num == 1){
            threadCheck();
        }
        System.out.println("the end");
    }


    private static void threadCheck() throws InterruptedException{

        PingPongThread ppt = new PingPongThread();
        Thread thread = new Thread(ppt);
        thread.start();
        num = 0;
        Thread.sleep(3000);

        Scanner s = new Scanner(System.in);

        thread.interrupt();

        System.out.println(num);
    }


    @Override
    public synchronized void run() {
        Scanner s = new Scanner(System.in);
        if (s.hasNext()) {
            num = 1;
        }
    }
}