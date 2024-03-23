import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {

        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principal amount in years :");
        int principal_amount = input.nextInt();

        System.out.println("Enter rate of interest : ");
        float rate = input.nextFloat();

        System.out.println("Enter time in years :");
        int time = input.nextInt();

        float interest = (principal_amount*rate*time)/100;
        System.out.println("Simple interest for the given parameters : "+ interest );

    }
}

