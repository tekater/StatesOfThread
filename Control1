public class Control1 {
    public static void main(String[] args) throws Exception {
        Thread currentThread = Thread.currentThread();
        Thread anotherThread = new Thread(currentThread);

        System.out.println(currentThread.getState());

        anotherThread.start();
        anotherThread.join(2000);
        Thread.sleep(2000);
        System.out.println(currentThread.getState());


        System.out.println(currentThread.getState());

        System.out.println(currentThread.getState());
    }
}
