public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,9,10,31,532};
        int target = 31;

        int result = bSearch(arr,target);
        System.out.println("Element found at index "+result);
    }
    static int bSearch(int[] arr, int target){
        int start = 1;
        int end = arr.length-1;
     

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
               return mid;
            }
            
        }
        return -1;
    }
}
