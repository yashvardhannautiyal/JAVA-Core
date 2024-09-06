import java.util.Arrays;
import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {
        System.out.println("nested try catch");
        int [] marks = new int[3];
        marks[0] = 4;
        marks[1] = 6;
        marks[2] = 5;

        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();

        try {
            System.out.println("welcome to wonderland");
            try {
                System.out.println(marks[9]);
                System.out.println(marks[ind]);//here outer catch exception will be handled as this try does not run as error occurred outsite this try catch block
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("this is invalid index as it does not exist");
                System.out.println("excpetion in slevel 2");
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("exception in level 1");
        }
    }
}
