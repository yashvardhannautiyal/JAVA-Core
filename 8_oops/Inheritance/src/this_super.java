//this and super keyword
class one{
    int a;
    one(int n){
        this.a = n;
    }

    public int getA() {
        return a;
    }

    public int returnone(){
        return 1;
    }
}

class two extends one{
    two(int m){
        super(m);
        System.out.println("I am a constructor with value " + m);
    }
}

public class this_super {
    public static void main(String[] args) {
        one a = new one(5);
        System.out.println(a.getA());
        two b = new two(7); //invokes default constructor
    }
}
