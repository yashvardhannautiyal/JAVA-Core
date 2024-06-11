import java.util.*;
public class arrays {
    public static void main(String[] args){
//        -----------METHOD 1----------------
//        int[] marks = new int[3];
//        marks[0] = 98;
//        marks[1] = 75;
//        marks[2] = 99;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

//        ------------METHOD 2--------------
//    int marks[] = {97,98,90};
//    for(int i =0; i<3; i++){
//        System.out.println(marks[i]);

//        taking size of array input from user
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i =0; i<size;i++){
        arr[i] = sc.nextInt();
    }

    for(int i =0; i<size; i++){
        System.out.println(arr[i]);
    }

//  Question
// Take an array as an input from the user. Search for a given number x and print the index at which it occurs
    }
}
