import java.util.Scanner;

public class ques_03 {
    public static void main(String[] args) {
        System.out.println("Write a program to check whether a year is a leap year or not.");
        //leap year if (year is divisible by 4 but not divisible by 100) OR year is divisible by 400
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
