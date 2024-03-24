public class Findmin {
    public static void main(String[] args) {
        // to find the minimum number in the array
        int[] arr = {1,2,134,41,25,32,11};
        System.out.println("Minimum element in the array is: "+min(arr));
        

    }
    static int min(int arr[]){
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(minimum>arr[i]){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
