//thread class constructos

//1) Thread(String name)
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


public class thread_class {
    public static void main(String[] args) {
        System.out.println("----------Thread class----------");
        myTh thr = new myTh("holla");
        thr.start();
        System.out.println("id of thread : "+ thr.getId());
        System.out.println("name of thread : "+ thr.getName());
    }
}
