//1. create a class cylinder and use getter and setters to set its radius and height
class cylinder{
    private double radius;
    private double height;

    private double pi=3.14;

    public void setRadius(int r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }

    public void setHeight(int h){
        height = h;
    }

    public double getHeight(){
        return height;
    }


//    2. calculate surface and volume of the cylinder
    public double surface(){
        return 2*pi*radius*(height+radius);
    }

    public double volume(){
    return pi*radius*radius*height;
    }


//   3. Use a constructor and repeat 1&2
        public cylinder(double r, double h){
        this.radius = r;
        this.height = h;
    }

//    4. Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
    private int length;
    private int breadth;
    public cylinder(int l, int b){
        this.length = l;
        this.breadth = b;
    }
}





public class practice {
    public static void main(String[] args) {
//        1
//        cylinder c = new cylinder();
//        c.setRadius(3);
//        c.setHeight(4);
//        System.out.println(c.getHeight());
//        System.out.println(c.getRadius());
//        2
//        System.out.println("Surface area = "+c.surface());
//        System.out.println("Volume = "+c.volume());
//        3
        cylinder a = new cylinder(4.2,5);
        System.out.println("Surface area = "+a.surface());
        System.out.println("Volume = "+a.volume());
//        4
        cylinder r = new cylinder(7,8);


    }
}
