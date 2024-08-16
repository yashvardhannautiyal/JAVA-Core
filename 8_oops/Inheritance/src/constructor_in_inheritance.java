//constructor in inheritance
class Base{
    public int x;

    Base(){
        System.out.println("I am a constructor");
    }

    Base(int x){
        System.out.println("i am an overloaded constructor with value of 0 ");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived1 extends Base{
    public int y;

    derived1(){
//        super(0);// super keyword is used to run constructor having argument and if super keyword is not used constructor with no argument will be invoked
        System.out.println("I am derived constructor");
    }

    derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived whil value of x and y");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class derived2{
    derived2(){
        System.out.println("i am child derived constructor");
    }

    derived2(int x, int y, int z){
        super(x,y);
        System.out.println("i am an overloaded constructor of derived2 class");
    }
}



public class constructor_in_inheritance {
    public static void main(String[] args) {
//        Base a = new Base();//runs base constructor
//        Base c = new Base(8);
        derived1 b = new derived1(14, 6); //runs constructor of base class first then it's own constructor
        derived2 d = new derived2();

    }
}
