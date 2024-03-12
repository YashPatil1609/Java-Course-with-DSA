import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter target number : ");
        
        int target = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr.length ==0){
                System.out.println("array empty");
            }

            else if(arr[i]==target){
                System.out.println(target+" found at index "+i);

            }
        }

        input.close();

        }
    }
 
    

