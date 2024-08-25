interface camera{
    void takePhoto();
    void recordVideo();//if we update normal method it will show error in the program using this interface
    default void record4k(){//default method can be updated and no error will occur in the whole program
        System.out.println("recording in 4k");
    }

}
interface wifi{
    String[] getNetworks();
    void connect(String network);
}


class CellPhone{
    void call(int phoneNum){
        System.out.println("calling" + phoneNum);
    }
    void takePhoto(){
        System.out.println("Taking photo");
    }
}

class SmartPhone extends CellPhone implements camera, wifi{
   public void takePhoto(){
        System.out.println("taking photo");
    }
  public void recordVideo(){
        System.out.println("recording video");
    }

    public String[] getNetworks(){
        System.out.println("Getting networks");
        String[] networkList = {"airtel", "vodafone"};
        return networkList;
    }

    public void connect(String network){
        System.out.println("Connected" + network);
    }

}




public class default_methods {
    public static void main(String[] args) {
        System.out.println("DEFAULT METHODS");
        SmartPhone ms = new SmartPhone();
       String[] ar =  ms.getNetworks();
       for(String item:ar){
           System.out.println(item);
       }
    }
}
