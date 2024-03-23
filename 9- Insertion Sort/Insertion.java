public class Insertion {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        iSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int[] iSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }

        return arr;
    }
    static void swap(int[] arr,int last,int maxindex){
        int temp = arr[last];
        arr[last]=arr[maxindex];
        arr[maxindex]=temp;
    }
}
