import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("practice set");
//      1  Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during
//      an Illegal argument exception.
//        try{
//            int a = 7/0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("this is illegalArgumentException");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e + "this is arithmetic exception");
//        }

//       2 and 3. Write a program that allows you to given. If max retries exceed 5 print "errors".
//        throw a custom Exception if max retries are reached.
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 5;
        marks[1] = 7;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while(flag || i<5){
            try {
                index = sc.nextInt();
                System.out.println("the value of marks[index] is :"+marks[index]);
                break;
            }
        catch (Exception e){
            System.out.println("invalid index");
            i++;
        }
            if(i>=5){
                System.out.println("error");
            }
            }


    }
}
