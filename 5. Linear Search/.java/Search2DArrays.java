import java.util.Scanner;

public class Search2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,13,123},
            {6,24,133},
            {9,233,12,98,100}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter element u wanna search : ");
        int target = in.nextInt();

        search2dArray(arr,target);
        in.close();
    }

    static void search2dArray(int arr[][],int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    System.out.println("Element found at index "+j+" of "+i+"th row");
                }
                
            }
        }
    }
}
