import java.util.*;

public class takingInput {
    public static void main(String[] args){
        //Input
        // Scanner scn = new Scanner(System.in);
        // String name = scn.nextLine();
        // System.out.println("Your name is : " + name);

        // Ques - Taking input of two numbers a and b and prinintg their sum 
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = a+b;
        System.out.println("Sum of a and b : "+sum);
    }
}
