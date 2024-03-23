import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){

            System.out.print("enter number : ");
            int num = input.nextInt();
            if(num==0){
                System.out.println("sum is = "+ sum);
                break;
            }
            sum = sum + num;
        }
    }
}
