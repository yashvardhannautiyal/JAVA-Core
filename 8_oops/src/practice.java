//1. Create a class Employee with the following properties and methods:
//Salary (property) (int)
//getSalary (method returning int)
//name (property) (String)
//getName (method returning String)
//setName (method changing name)

//class Employe{
//    int salary;
//    String name;
//    public void getSalary(){
//        System.out.println("My salary is "+salary);
//    }
//
//    public void getName(){
//        System.out.println("my name is "+name);
//    }
//
//    public void setName(String nm){
//        name = nm;
//        System.out.println("new name is "+name);
//    }
//
//}

//2. Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

//class cellphone{
//    public void ring(){
//        System.out.println("Ringing...");
//    }
//
//    public void vibrate(){
//        System.out.println("Vibrating...");
//    }
//}



//Create a class Square + rectangle + circle with a method to initialize its side, calculating area, perimeter etc.
class square{
    int side;
    public void area(){
        System.out.println("Area of square : "+side*side);
    }
    public void perimeter(){
        System.out.println("Perimeter of square : "+4*side);
    }
}


class rectangle{
    int l;
    int b;
    public void area(){
        System.out.println("Area of rectangle : "+l*b);
    }
    public void perimeter(){
        System.out.println("Perimeter of rectangle : "+2*(l+b));
    }
}

class circle{
    int r;
    double pi = 3.14;
    public void area(){
        System.out.println("Area of circle : "+pi*r*r);
    }
    public void perimeter(){
        System.out.println("Perimeter of circle : "+2*pi*r);
    }
}

















public class practice {
    public static void main(String[] args) {
//        solution 1
//        Employe a = new Employe();
//        a.salary = 20000;
//        a.name = "apple";
//        a.getSalary();
//        a.getName();
//        a.setName("ball");


//        solution 2
//        cellphone a = new cellphone();
//        a.ring();
//        a.vibrate();


//        soultion 3
    square s = new square();
    s.side = 3;
    s.area();
    s.perimeter();

    rectangle r = new rectangle();
    r.l = 2;
    r.b=5;
    r.area();
    r.perimeter();

    circle c = new circle();
    c.r=3;
    c.area();
    c.perimeter();

    }
}
