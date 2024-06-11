import java.util.*;
public class Two_DArrays {
    public static void main(String[] args) {
//        Two D array form up as a Matrix[rows][columns]
//        size of each block/cell = data_type of array && total size of array = (rows*cols)*data_type

//        Declaration
//        type[][] arrayName = new type[rows][cols];
//        ex: int[][] nums = new int[3][5];

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
//      Declare
        int [][] numbers = new int[rows][cols];
//      INPUT
        for(int i=0; i<rows; i++){//rows
            for(int j=0;j<cols; j++){//cols
               numbers[i][j] = sc.nextInt();
            }
        }
//        OUTPUT
        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        //Seacrhing for an element x in matrix
        int num = sc.nextInt();
        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                if(numbers[i][j] == num){
                    System.out.println("Number found at index" + " [" +  i + " " + j + "]");
                }

            }
        }
    }
}
