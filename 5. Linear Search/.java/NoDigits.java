public class NoDigits {
    public static void main(String[] args) {
        int[] arr = {12,1,134,45,67,98};

        countDigits(arr);
    }

    static int countDigits(int[] arr){
        int digits=0;

        for (int num : arr) {
            while(num>0){
                num=num/10;
                digits++;
            }
            
            

        }

        return digits;
    }
    
}
