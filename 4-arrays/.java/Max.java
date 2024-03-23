public class Max {
    public static void main(String[] args) {
        int[] arr = {12,41,741,83,9927,61};

        
        int result = max(arr);
        System.out.println("Max element in given array is : "+result);
    }
    static int max(int[] arr){

        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        return maximum;
       
        
    }
}
