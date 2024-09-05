public class tryCatchBlock {
    public static void main(String[] args) {
        System.out.println("try catch block.....");
        int a =6000;
//        int b = 9;
        int b = 0;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("we failed to devide");
            System.out.println(e);
        }
        System.out.println("end of program"); //this line will execute even after the error occurs

    }
}
