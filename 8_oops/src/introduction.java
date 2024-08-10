//creating a class
class Employee{
//    variables/data member : data variables
    int id;
    String name;
//    member function : methods
    public void info(){
        System.out.println("My id is : "+id);
        System.out.println("and my name is : "+ name);
    }
}


//there is only one public class in a java file
public class introduction {
    public static void main(String[] args){
        System.out.println("this is a custom class");

//        creating an object
        Employee harry = new Employee();
//        giving values
        harry.id = 98;
        harry.name = "harry";
//        System.out.println(harry.id);
//        System.out.println(harry.name);
//        calling member function
        harry.info();
    }
}
