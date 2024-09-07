public class finally_block {
    public static void main(String[] args) {
        System.out.println("---------------finally block in java-----------");

        try {
           int a = 5;
            int b =0;
            int c = a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }

        finally {//finally block will always run whether exception occurs or not
            System.out.println("this is the end of program");
            }


    }
}
