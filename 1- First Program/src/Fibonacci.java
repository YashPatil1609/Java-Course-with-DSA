import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // To calculate Fibonacci Series up to n numbers.
        // 0,1,1,2,3,5,8,13,21....
        int a = 0;
        int b = 1;

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
