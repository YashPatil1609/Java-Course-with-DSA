public class Bubble {
    public static void main(String[] args) {
        int[] arr = {3,2,7,1,5};
        System.out.println("Before Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        bubblesort(arr);
        System.out.println("After Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
     
    static int[] bubblesort(int[] arr){
        boolean swap = false;

        for(int i = 0;i<arr.length;i++){
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;     // breaking if array is already sorted, and no swaps occur in the first pass
            }
        }

        return arr;
    }
}
