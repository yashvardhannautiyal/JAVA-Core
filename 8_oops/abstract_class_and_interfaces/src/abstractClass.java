//abstract class and interfaces
//syntax for abstract class and method
abstract class parent{
    public parent(){
        System.out.println("I am base constructor");
    }
    public void hello(){
        System.out.println("hello");
    }
    abstract public void greet();

}

class child extends parent{
    //child class must use greet absrtract method either the child class should be an abstract class
    @Override
        public void greet(){
        System.out.println("good morning");
    }
}



public class abstractClass {
    public static void main(String[] args) {
//        we cannot create abstract class object
//        parent p = new parent();
        child c = new child();
        c.greet();
    }
}
