class A{
    public int a;
    public int b(){
        return 1;
    }

    public void meth2(){
        System.out.println("I am method2 of class A");
    }

}

class B extends A{
    @Override //denotes that the method is overrided
    public void meth2(){
        System.out.println("I am method2 of class B");//we can change items in method overriding
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();

    B b = new B();
    b.meth2();
    }
}
