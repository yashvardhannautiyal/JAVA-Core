//inheritance
class xyz{
public int x;

public void setX(int x){
    this.x = x;
    System.out.println("Setting value of x");
}

public int getX(){
    return x;
}
}

class derived extends xyz{
    public int y;

}



public class inheritance {
    public static void main(String[] args) {
        xyz a = new xyz();
        a.setX(5);
        System.out.println(a.getX());

        derived b = new derived();
        b.setX(7);
        System.out.println(b.getX());
    }
    }
