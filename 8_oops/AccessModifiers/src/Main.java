//ACCESS MODIFIERS
class modifiers{
//    private access modifier
    private int val;
    private String name;

//    public access modifier
    public void getVal(){
        System.out.println(val + name);
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        modifiers a = new modifiers();
//        a.val = 67;
//        a.name = "hello";
        a.getVal();

    }
}