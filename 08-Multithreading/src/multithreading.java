//Creating thread using : extends Thread method

class myThread extends Thread{
    @Override
    public void run(){
        int i = 0;
    while(i < 80){
        System.out.println("My thread is running");
        System.out.println("i am happy");
        i++;
    }
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0 ;
        while(i< 80){
            System.out.println("myThread2 is running");
            System.out.println("i am happy2");
            i++;
        }
    }
}


public class multithreading {
    public static void main(String[] args) {
        System.out.println("multithreading");
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        t1.start(); // start method internally call (run) methods declared in a thread
        t2.start();

    }
}
