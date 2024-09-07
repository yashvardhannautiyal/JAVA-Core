import java.util.Scanner;

class myExceptions extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}



public class ExceptionClass {
    public static void main(String[] args) {
        System.out.println("exception class in java");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a<99){
            try {
                throw new myExceptions();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }

        }
    }
}
