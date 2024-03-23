import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Write a program to print the factorial of a number by defining a method named 'Factorial'.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get its factorial : ");
        int n = input.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of "+n+" is "+result);
    }
    static int factorial(int n){
        int fact = 1;
        if(n!=0 && n!=1){
            for (int i = 1; i <= n ; i++) {
                fact = fact*i;
            }
            return fact;

        }
        else{
            return 1;
        }

    }
}
