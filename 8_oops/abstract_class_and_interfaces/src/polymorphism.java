interface camera1{
    void takePhoto1();
    void recordVideo1();//if we update normal method it will show error in the program using this interface
    default void record4k(){//default method can be updated and no error will occur in the whole program
        System.out.println("recording in 4k");
    }

}
interface wifi1{
    String[] getNetworks1();
    void connect1(String network);
}


class CellPhone1{
    void call1(int phoneNum){
        System.out.println("calling" + phoneNum);
    }
    void takePhoto1(){
        System.out.println("Taking photo");
    }
}

class SmartPhone1 extends CellPhone1 implements camera1, wifi1{
    public void takePhoto1(){
        System.out.println("taking photo");
    }
    public void recordVideo1(){
        System.out.println("recording video");
    }

    public String[] getNetworks1(){
        System.out.println("Getting networks");
        String[] networkList = {"airtel", "vodafone"};
        return networkList;
    }

    public void connect1(String network){
        System.out.println("Connected" + network);
    }

}


public class polymorphism {
    public static void main(String[] args) {
        System.out.println("POLYMORPHISM..........");
        camera1 cam = new SmartPhone1();
//        cam.getNetworks(); --> not allowed as only camera methods can be used as we are asking for camera method
    cam.takePhoto1(); //this uses the smartphone in form of camera;polymorphism
    }
}
