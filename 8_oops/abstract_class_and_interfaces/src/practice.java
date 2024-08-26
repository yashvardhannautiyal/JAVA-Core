import org.w3c.dom.ls.LSOutput;

//1. create abstract class pen with methods write() and refill() as abstract methods
//abstract class pen{
//    abstract void write();
//    abstract void refill(); }


//2. Use pen class from 1 to create a concrete class FountainPen with additional method changeNib()
//    class FountainPen extends pen{
//    @Override
//    public void write(){
//        System.out.println("writing...");
//    }
//    public void refill(){
//        System.out.println("refilling....");
//    }
//    public void changeNib(){
//        System.out.println("changing nib....");
//    }
//         }



//3. Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits
// this monkey class and implements basic animal interface with eat ( ) and sleep methods
//4 Demonstrate polymorphism using using monkey  class from Q3

//class monkey{
//    public void jump(){
//        System.out.println("jumping.....");
//    }
//    public void bite(){
//        System.out.println("biting....");
//    }
//}
//
//interface animal{
//    void eat();
//    void sleep();
//}
//
//class human extends monkey implements animal{
//    public void eat(){
//        System.out.println("eating....");
//    }
//    public void sleep(){
//        System.out.println("sleeping....");
//    }
//    public void bath(){
//        System.out.println("bathing");
//    }
//}


//5 Create a class telephone with ring( ) , lift ( ) and disconnected ( ) methods as abstract methods
// create another class smartphone and demonstrate polymorphism
//abstract class telephone{
//    abstract void ring();
//    abstract void lift();
//    abstract void disconnected();
//}
//
//class Smartphone extends telephone{
//    public void ring(){
//        System.out.println("ringing...");
//    }
//    public void lift(){
//        System.out.println("lifitng...");
//    }
//    public void disconnected(){
//        System.out.println("disconnected...");
//    }
//}


//6. Create an interface TvRemote and use it to inherit another interface SmartTvRemote
//7. Create a class Tv which implements TvRemote interface
interface TvRemote extends SmartTvRemote{
    void On();
    void Off();
    }


interface SmartTvRemote{
    void Netflix();
    void Youtube();
}

class Tv implements TvRemote{
    public void On(){
        System.out.println("turn on");
    }
    public void Off(){
        System.out.println("turn off");
    }
    public void Netflix(){
        System.out.println("netflix");
    }
    public void Youtube(){
        System.out.println("youtube");
    }
}




public class practice {
    public static void main(String[] args) {
//        1 & 2
//    FountainPen p = new FountainPen();
//    p.write();
//    p.refill();
//    p.changeNib();

//        3
//        human h = new human();
//        h.eat();
//        h.jump();
//        h.bite();
//        h.sleep();

//        4
//        monkey m = new human();
//        m.jump();
//        m.bite();

//        5
//        telephone t = new Smartphone();
//        t.disconnected();
//        t.lift();
//        t.ring();

//        6 & 7
        Tv t = new Tv();
        t.On();
        t.Off();
        t.Netflix();
        t.Youtube();

    }
}