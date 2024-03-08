import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if its a prime number or not : ");
        int num = input.nextInt();
        primeNum(num);
    }
    static void primeNum(int num){
        int c = 2;
        while(c<= sqrt(num)){
            if(num%c==0){
                System.out.println("Not a prime number");
                return;
            }
            c++;
        }
        System.out.println("Prime Number");


    }
}
