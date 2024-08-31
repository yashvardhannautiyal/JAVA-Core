//thread priorities
class myTh extends Thread{
    public myTh(String name){
        super(name);//this will call the method in the class which takes input of name
    }
    public void run(){
        int i = 0;
        while(i<=15){
            System.out.println("i am a thread " + this.getName());
            i++;
        }
    }
}


public class thread_priorities {
    public static void main(String[] args) {
        System.out.println("------------Thread priorities------");
        myTh t1 = new myTh("hallo");
        myTh t2 = new myTh("world");
        myTh t3 = new myTh("gutten tag");
        myTh t4 = new myTh("gutten morgan");
        myTh t5 = new myTh("gutten abend");
        myTh t6 = new myTh("es geht (most important)----------------");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t6.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
