//ACCESS MODIFIERS
class modifiers{
//    private access modifier
    private int val;
    private String name;

//    public access modifier
    public void setVal(int v){
       val = v;
    }
    public int getVal(){
        return val;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}



public class Main {
    public static void main(String[] args) {
        modifiers a = new modifiers();
//        a.val = 67;
//        a.name = "hello"; throws error as private access modifier
        a.setVal(67);
        System.out.println(a.getVal());
        a.setName("hello");
        System.out.println(a.getName());

    }
}