import java.util.Scanner;

public class SearchInRange{
    public static void main(String[] args) {
        // Linear Search in a given range
        Scanner input = new Scanner(System.in);

        int[] arr = new int[7];

        
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }

        System.out.println("Enter the element u wanna search : ");
        int target = input.nextInt();


        System.out.println("Enter start and end range : ");
        int start = input.nextInt();
        int end = input.nextInt();

        searchRange(arr, start, end,target);
    }

    static void searchRange(int arr[],int start, int end,int target){
        for (int i = start; i < end; i++) {
            if(arr[i]==target){
                System.out.println("Element found at index "+i);
            }
            
        }
    }
}