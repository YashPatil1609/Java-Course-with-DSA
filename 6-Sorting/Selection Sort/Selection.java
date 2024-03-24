public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Before Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("After Sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           int lastindex = arr.length-i-1;
           int maxindex = maxIndex(arr,0,lastindex);
           swap(arr,lastindex,maxindex); 
        }

        return arr;
    }
    static int maxIndex(int[] arr,int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int last,int maxindex){
        int temp = arr[last];
        arr[last]=arr[maxindex];
        arr[maxindex]=temp;
    }
}
