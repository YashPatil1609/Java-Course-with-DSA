import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int input;

        System.out.println("Enter integers (enter 0 to finish):");

        do {
            input = scanner.nextInt();
            if (input != 0 && input > largest) {
                largest = input;
            }
        } while (input != 0);

        if (largest != Integer.MIN_VALUE) {
            System.out.println("The largest number entered is: " + largest);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}
