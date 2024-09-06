import java.util.Arrays;
import java.util.Scanner;

public class handlingExceptions {
    public static void main(String[] args) {
        System.out.println("handling specific exceptions");
        int [] marks = new int[3];
        marks[0] = 3;
        marks[1] = 4;
        marks[2] = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index");
        int ind = sc.nextInt();


        System.out.println("Enter number you want to divide the value with");
        int num = sc.nextInt();
        try {
            System.out.println("The value at array index entered is "+marks[ind]);
            System.out.println("The value of array value divided by number is "+ marks[ind]/num);
        }
        catch (ArithmeticException e ){ //exceptions are handled in order they are written : first this
            System.out.println("Arithmetic exception occurred");
            System.out.println(e);//this prints the exception that has occurred
        }
        catch (ArrayIndexOutOfBoundsException f ){//second exception going to be handled
            System.out.println("Array index out of bound exception occurred");
            System.out.println(f);//this prints the exception that has occurred
        }

        catch (Exception g ){//third exception handled
            System.out.println("Some exception occurred");
            System.out.println(g);//this prints the exception that has occurred
        }

    }
}
