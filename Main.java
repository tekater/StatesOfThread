package Example1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Example1Thread(); // инициадизировали
        System.out.println(thread.getState());

        thread.start(); // запустили поток
        System.out.println(thread.getState());

        Thread thread2 = new Example1Thread2(thread);

        thread2.start();
        Example1Thread2.threadRunner(thread);


        //thread.join(); // ждём окончания потока
        System.out.println(thread.getState());


        //Example1Thread2.threadRunner(thread);
        //System.out.println(Example1Thread2.threadRunner(thread));

        System.out.println(thread2.getState());



    }
}