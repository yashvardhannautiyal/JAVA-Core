//thread priorities
class myTh extends Thread{
    public myTh(String name){
        super(name);//this will call the method in the class which takes input of name
    }
    public void run(){
        int i = 0;
        while(i<=9){
            System.out.println("i am a thread");
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
        myTh t6 = new myTh("es geht");

    }
}
