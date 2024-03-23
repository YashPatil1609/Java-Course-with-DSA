import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a ro check if its a armstrong number : ");
        int n = input.nextInt();
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;

        }
        if(original == sum){
            System.out.println(original + " is a armstrong number.");

        }
        else {
            System.out.println("Not a palindrome number.");
        }

    }
}
