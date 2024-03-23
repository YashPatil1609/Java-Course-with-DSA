import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check if its palindrome : ");
        int n = input.nextInt();
        int rev = 0;
        int original = n;

        while(n>0){

            int rem = n % 10;
            n = n/10;
            rev = rev*10 + rem;


        }
        if(original == rev){
            System.out.println(original + " is a palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }






    }
}
