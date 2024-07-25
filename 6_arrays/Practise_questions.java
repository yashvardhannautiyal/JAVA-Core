//practise questions from codewithharry
import java.util.*;
public class Practise_questions {
    public static void main(String[] args) {
//       1. Create an array of 5 floats and calculate their sum
//        float sum = 0;
//        float [] arr = {1.2f, 2.3f, 3.4f, 4.5f, 5.6f};
////        for-each loop iterates for each value of the data_type in array
//        for (float v : arr) {
//            sum = sum + v;
//        }
//        System.out.println(sum);
//    }





//    2. Write a program to find out whether a given integer is present in an array or not.
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number you want to search in array : ");
//        int num = sc.nextInt();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == num) {
//                System.out.println("Number found at index" + i);
//            }
//            else {
//                System.out.println("Number not found at index" + i);
//            }
//
//        }






//      3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int average = 0;
//        for(int v : arr){
//            average = (average + v);
//        }
//        System.out.println(average/2);




//        4. Create a Java program to add two matrices of size 2x3.
//        int[][] matrixA = {{1,2,3},{4,5,6}};
//        int[][] matrixB = {{4,5,6},{7,8,9}};
//        int[][] temp = {{0,0,0},{0,0,0}};
////printing matrixA and matrixB
//        System.out.print("Matrix A : ");
//        for(int i =0; i<matrixA.length; i++){
//        System.out.println("");
//        for(int j=0;j<matrixA[i].length;j++){
//            System.out.print(matrixA[i][j]);
//        }
//    }
//        System.out.print("\nMatrix B : ");
//        for(int i =0; i<matrixB.length; i++){
//            System.out.println("");
//            for(int j=0;j<matrixB[i].length;j++){
//                System.out.print(matrixB[i][j]);
//            }
//        }
//
//
////        printing sum of both matrices
//for (int i = 0; i<matrixA.length; i++){
//    for(int j=0; j<matrixA[i].length;j++){
//        temp[i][j] = matrixA[i][j] + matrixB[i][j];
//    }
//}
//
//        System.out.print("\nSum of both the matrices : ");
//        for(int i =0; i<temp.length; i++){
//            System.out.println("");
//            for(int j=0;j<temp[i].length;j++){
//                System.out.print(temp[i][j]);
//            }
//        }






//       5.Write a Java program to find the maximum element in an array.
//        int[] arr = {1, 2, 3, 4, 9, 6, 7, 8};
//        int max = 0;
//       for(int v=0; v<arr.length-1; v++){
//           if(arr[v] < arr[v+1]){
//               max = arr[v+1];
//           }
//           else{
//               max = arr[v];
//           }
//       }
//       System.out.println("Maximum element in array : "+max);






//        7.Write a Java program to find whether an array is sorted or not.
        int[] arr = {1, 2, 3, 4, 9, 6, 7, 8};
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }



    }
}
