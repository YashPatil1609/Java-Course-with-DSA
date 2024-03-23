import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to check the greatest : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int result = greatest(num1,num2,num3);
        System.out.println(result+" is the greatest");

    }
    static int greatest(int num1, int num2, int num3){
        int max = num1;
        if(max<num2){
            max = num2;
        }
        if(max<num3){
            max = num3;
        }
        return max;
    }
}