import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {

        // Write a program to print whether a number is even or odd, also take input from the user.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check even or odd : ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
}
