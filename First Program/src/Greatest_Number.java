import java.util.Scanner;

public class Greatest_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 Numbers to get the greatest among them : ");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a>b){
            System.out.println(a+" is the greatest");
        }
        else{
            System.out.println(b+" is the greatest");
        }
    }
}
