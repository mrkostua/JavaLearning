package Threads;

/**
 * @author Konstantyn Prysiazhnyi on 25.06.2017.
 */
public class TwoThread {


    private static void threadInterrupt(){

        Runnable runnableInterrupt1 = () -> {
            System.out.println("runnableInterrupt1 start");
            for(int i =0; i<20;i++){
                //way to interrupt thread
                if(Thread.interrupted()){
                    System.out.println("runnableInterrupt1 is interrupted");
                    //     throw new InterruptedException(); better way gives us possibility to handle exception in a catch clause

                    return;
                }
                else {
                    System.out.println(i);
                }
            }

        };

        //way to interrupt thread
        Runnable runnableInterrupt2= () ->{
            System.out.println("runnableInterrupt2 start");

            for(int i=0;i<20;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("runnableInterrupt2 is interrupted");
                    return;
                }
                System.out.println(i);
            }
        };

        Thread thread1 = new Thread(runnableInterrupt1);
        Thread thread2 = new Thread(runnableInterrupt2);

        thread1.start();
        thread2.start();

        thread1.interrupt();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.interrupt();
    }



    public static void main(String[] args) {
        Thread thread = new Thread(new NewThread());
        Thread thread2 = new Thread(new NewThread());

        (new Thread(new NewThread())).start();

        thread.start();

        thread2.start();


        System.out.println("\n///////////////////////////////");
        TwoThread.threadInterrupt();


    }
}


class NewThread implements Runnable{

    @Override
    public void run() {
        System.out.println("start thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("thread : " +Thread.currentThread().getName() + " exception " + e.getMessage() );
        }
        System.out.println("end thread : " + Thread.currentThread().getName());
    }
}
