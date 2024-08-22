//1 create a class circle and use inheritance to create another class cylinder from it.
// And create methods for area of circle and volume of cylinder

//class circle{
//    public int r;
//    circle(int rad){
//        System.out.println("I am circle prameterized constructor");
//        this.r = rad;
//    }
////    method : area of circle
//    public double area(){
//        return Math.PI*this.r*this.r;
//    }
//}
//
//class cylinder extends circle{
//    public int h;
//    cylinder(int he, int r){
//        super(r);
//        System.out.println("I am cylinder parameterized constructor");
//        this.h = he;
//    }
////   method : volume of cylinder
//    public double vol(){
//    return Math.PI*this.r*this.r*this.h;
//    }
//}




//2 Create a class rectangle and use inheritance to create another class cuboid
//And create methods for area & volume in 2 also create getters and setters

class rectangle{
    public int l;
    public int b;
    public int getL() {
        return l;
            }

    public int getB() {
        return b;
    }

    public void setVal(int len, int bre) {
        this.l = len;
        this.b = bre;
    }

    public int area(){
        return this.l*this.b;
    }
}

class cuboid extends rectangle{
    public int h;

    public int getH() {
        return h;
    }

    public void setH(int hi, int le, int br) {
        this.h = hi;
        this.l = le;
        this.b = br;
    }
    public int vol(){
        return this.h*this.b*this.l;
    }
}


public class practice {
    public static void main(String[] args) {
//        1
//        circle obj = new circle(4);
//        cylinder obj2 = new cylinder(4, 4);
//        System.out.println(obj.area());
//        System.out.println(obj2.vol());
        rectangle rec = new rectangle();
        rec.setVal(4,4);
        System.out.println("Length : "+rec.getL());
        System.out.println("Breadth : "+rec.getB());
        System.out.println("Area of rectangle : "+rec.area());

        cuboid cub = new cuboid();
        cub.setH(4,4,4);
        System.out.println("volume of cuboid : "+cub.vol());


    }
}
