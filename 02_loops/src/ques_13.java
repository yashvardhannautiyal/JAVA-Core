public class ques_13 {
    public static void main(String[] args) {
        System.out.println("Calculate the sum of the first 100 natural numbers using a loop.");
        int sum = 0;
        for(int i = 1; i<=100; i++ ){
            sum = sum + i;
        }
        System.out.println("Sum of first 100 natural numbers : "+sum);
    }
}
