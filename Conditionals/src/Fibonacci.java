import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci Series In Java Programs
        // 0,1,1,2,3,5,8,13,21.... This is the fibonacci series

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum=0;
        int a=0;
        int b=1;
        for (int i = 0; i <= n; i++) {
            System.out.println(sum);
            sum = a+b;
            a=b;
            b=sum;
            i++;


        }
    }
}
