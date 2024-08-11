//CONSTRUCTORS
class func{
    int id;
    String name;
    public func(String n, int i){
        id = i;
        name = n;
    }
//    constructor overloading
    public func(double h){
        System.out.println(h);
    }

    public String getName(){return name;}
    public void setName(String s){this.name = s;}
    public int getId(){return id;}
    public void setId(int d){id = d;}
}


public class constructors {
    public static void main(String[] args) {
        //direct invoking the data
//        func hello = new func("helloWorld!",88);
        func hello = new func(3.14);
        System.out.println(hello.getName());
        System.out.println(hello.getId());


    }
}
