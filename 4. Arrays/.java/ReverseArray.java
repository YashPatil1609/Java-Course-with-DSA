public class ReverseArray {
    public static void main(String[] args) {
        // Reverse the given array

        int[] arr = {1,2,3,4,5,6};
        arrayReverse(arr);
       


    }
    static void arrayReverse(int[] arr){
        int start = 0;  // start index
        int end = 5;    // end index
        while(start<end){
            int temp = arr[start];   // storing element at first index to temp
            arr[start] = arr[end];   // 
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
