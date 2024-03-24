public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,9,10,31,532};
        int target = 8;

        int result = ceiling(arr,target);
        System.out.println("Ceiling of the target is "+arr[result]);
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return start;
    }
}
