class myNewTh extends Thread{
    public void run(){
        int i = 0;
        while(i<=30){
            System.out.println("i am a thread 1");
            i++;
        }
    }
}class myNewTh2 extends Thread{
    public void run(){
        int i = 0;
        while(i<=30){
            System.out.println("i am a thread 2");
            try {
                Thread.sleep(455); //thread sleeps  for 455 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}


public class thread_methods {
    public static void main(String[] args) {
        System.out.println("-------thread methods-------");

        myNewTh t1 = new myNewTh();
        myNewTh2 t2 = new myNewTh2();
        t1.start();

//        .join() method

//        try{                         // inside try we see if the code runs without any error
//            t1.join();
               //this will first make the t1 thread end and then t2 thread will start it's working
//            //this expects exception handling to be done for the execution
//        }
//        catch (Exception e){                   //if there is some error it is handled by catch
//            System.out.println(e);
//        }

        t2.start();


    }

}
