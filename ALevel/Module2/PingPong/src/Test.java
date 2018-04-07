import java.util.Scanner;

public final class Test implements Runnable {

    private static int num;

    @Override
    public synchronized void run() {
        Scanner s = new Scanner(System.in);
        if (s.hasNext()) {
            num = 1;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        PingPongThread ppt = new PingPongThread();
        Thread thread = new Thread(ppt);
        thread.start();
        num = 0;
        Thread.sleep(2000);

        Scanner s = new Scanner(System.in);

        thread.interrupt();

        System.out.println(num);

    }


    private static void threadCheck(){

    }

}