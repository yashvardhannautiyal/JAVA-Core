import java.util.Scanner;

public class ques_04 {
    public static void main(String[] args) {
        System.out.println("Implement a program to calculate grade based on marks using if-else.");
        //grade scale : A - 85-100
        //B - 70-85
        //C - 50-70
        //D - 25-50
        //E - 0-24

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks out of 100 : ");
        int marks = sc.nextInt();

        if(marks > 85){
            System.out.println("Grade : A");
        }
        else if (marks>70 && marks<85){
            System.out.println("Grade : B");
        }
        else if (marks>50 && marks<70){
            System.out.println("Grade : C");
        }
        else if(marks>25 && marks<50){
            System.out.println("Grade : D");
        }
        else if(marks>0 && marks<25){
            System.out.println("Grade : E");
        }

    }
}
