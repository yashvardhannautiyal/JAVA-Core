//creating thread using runnable interface method

class myRunnableThread implements Runnable{
    public void run(){
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
        System.out.println("i am a thread");
    }
}
class myRunnableThread2 implements Runnable{
    public void run(){
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
        System.out.println("i am a thread2");
    }
}

public class runnable_Interface {
    public static void main(String[] args) {
        System.out.println("Runnable Interface");
//        runnable interface cannot directly use start() method
        myRunnableThread bullet1 = new myRunnableThread();
        Thread gun1 = new Thread(bullet1);

        myRunnableThread2 bullet2 = new myRunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
