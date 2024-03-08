import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        //Write a program that will ask the user to enter his/her marks (out of 100). Define a method
        // that will display grades according to the marks entered as below:
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//         <=40          Fail

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks = input.nextInt();
        grades(marks);
    }
    static void grades(int marks){
        if(marks >= 91 && marks <= 100){
            System.out.println("Your grade is AA");
        }
        else if(marks >= 81 && marks <= 90){
            System.out.println("Your grade is AB");
        }
        else if(marks >= 71 && marks <= 80){
            System.out.println("Your grade is BB");
        }
        else if(marks >= 61 && marks <= 70){
            System.out.println("Your grade is BC");
        }
        else if(marks >= 51 && marks <= 60){
            System.out.println("Your grade is CD");
        }
        else if(marks >= 41 && marks <= 50){
            System.out.println("Your grade is DD");
        }
        else if(marks<=40){
            System.out.println("Fail");
        }
        else{
            System.out.println("Enter marks within 100");
        }
    }
}
