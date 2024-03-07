import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Input a number and print all the factors of that number (use loops).
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to get factors : ");
        int num = input.nextInt();

        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }


        }
    }
