public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,9,10,31,532};
        int target = 3;

        int result = floor(arr,target);
        System.out.println("Floor of the target is "+arr[result]);
    }
    
    static int floor(int[] arr, int target){
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
        return end;
    }
}
