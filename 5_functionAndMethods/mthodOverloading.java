//Method Overloading : same name but parameters are different


public class mthodOverloading {
//    static void methodOverload(){
//        System.out.println("Hello");
//    }
//
//    static void methodOverload(int a){
//        System.out.println("hello agent " + a);
//    }
//
//    public static void main(String[] args){
//        methodOverload();
//        methodOverload(007);
//    }



//    Varargs
 static int varargs(int ...arr){
     int sum=0;
     for(int a : arr){
         sum = sum+a;
     }
     return sum;
 }

public static void  main(String[] args){
    System.out.println(varargs(7));
    System.out.println(varargs(4,5));
    System.out.println(  varargs(5,6,7,8,9));


}

}

