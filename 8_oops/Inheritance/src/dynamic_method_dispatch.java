import com.sun.security.jgss.GSSUtil;

//dynamic method dispatch
class Phone{
    public void name(){
        System.out.println("name : phone");
    }
    public void greet(){
        System.out.println("hello world");
    }
}

class SmartPhone extends Phone{
    public void name(){
        System.out.println("naam : smartphone");
    }
    public void swagat(){
        System.out.println("apka swagat hai");
    }
}


public class dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        obj.name();
//        SmartPhone smartObj = new SmartPhone();
        Phone obj = new SmartPhone(); //valid!! : can create object of a super class with reference of sub class
//        SmartPhone obj2 = new Phone(); //not valid!!
        obj.greet();
        obj.name(); // method (name) of sub class will run in this case
        // method overriden and methods of super-class can only run by this object and will not run any other methods of sub-class

//        this is used in run time polymorphism as object is created when program is being run
    }
}
