package Example1;

public class Example1Thread2 extends Thread{
    Thread thread;
    public Example1Thread2(Thread thread){
        this.thread = thread;
    }
    @Override
    public void run() {
        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread2");
    }
    public static String threadRunner(Thread thread) throws InterruptedException {
        thread.join();
        return "ok";
    }
}
