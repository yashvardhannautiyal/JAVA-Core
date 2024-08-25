interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{ //inherited sampleInterface
    void meth3();
    void meth4();
}
//a class cannot inherit a interface
//class childSample extneds sampleInterface{
//    code();
//}

class mySample implements childSampleInterface{
    public void meth3(){
        System.out.println("Meth 3"); }
    public void meth4(){
            System.out.println("Meth 4");
        }
    public void meth1(){
        System.out.println("Meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
}


public class inheritance_in_interfaces {
    public static void main(String[] args) {
        System.out.println("Inheritance in interfaces");
        mySample my = new mySample();
        my.meth1();
        my.meth2();
        my.meth3();
        my.meth4();
    }
}
