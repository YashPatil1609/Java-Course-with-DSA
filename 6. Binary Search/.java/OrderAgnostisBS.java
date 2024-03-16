import java.util.Scanner;

public class OrderAgnostisBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,4,5,6,9,10,31,532};
        int target = input.nextInt();

        int result = bSearch(arr,target);

        if(result!= -1){
            System.out.println("Element found at index "+result);
        }else{
            System.out.println("Element not found !");
        }
    }

    static int bSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
               }else{
                    if(target>arr[mid]){
                        end=mid-1;
                        }
                    else{
                        start=mid+1;
                        }
                    }
            
        }

        return -1;
    }
}
