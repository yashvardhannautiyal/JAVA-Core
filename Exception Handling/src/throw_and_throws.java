import java.util.SplittableRandom;

class NegativeRadius extends Exception{
    @Override
    public String toString(){
        return "radius cannot be negative";
    }
}



public class throw_and_throws {
    public static double area(int r) throws NegativeRadius{
        if(r<0){
            throw new NegativeRadius();
        }
        double result = Math.PI*r*r;
        return result;
    }












//    throws
   public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("throw and throws keyword in java");

        try {
            int c = divide(6,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }

    try {
        double ar = area(7);
        System.out.println(ar);

    }
    catch (Exception e){
        System.out.println(e);
    }
    }
}
