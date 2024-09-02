//1)Write a program to print "Good morning" and "Welcome" continuously on the screen using threads.
//class GoodMorning extends Thread{
//    @Override
//    public void run(){
//        int i = 0;
//        while(i<50){
//        System.out.println("good morning");
//        i++;
//    }}
//}

//class welcome extends Thread{
//    @Override
//    public void run(){
//        int i = 0;
//        while(i<50){
//        System.out.println("welcome");
//        i++;
//    }}
//}

//2) Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
//class welcome extends Thread{
//    @Override
//    public void run(){
//        try{
//            Thread.sleep(200);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        int i = 0;
//        while(i<50){
//            System.out.println("welcome");
//            i++;
//        }
//
//    }
//}

//3)Demonstrate gerPriority() and setPriority() methods in Java threads.
class thread1 extends Thread{
    public void run(){
        System.out.println("i am thread i");
    }
}class thread2 extends Thread{
    public void run(){
        System.out.println("i am thread j");
        System.out.println(Thread.currentThread().getState());
    }
}

public class practice {
    public static void main(String[] args) {
        System.out.println("---------practice questions---------");
//        1 & 2
//        GoodMorning t1 = new GoodMorning();
//        welcome t2 = new welcome();
//        t1.start();
//        t2.start();
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
        t1.setPriority(10);
        t2.setPriority(5);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
    }

}
