import java.util.Arrays;

public class ShuffleArray {
    // Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    // Return the array in the form [x1,y1,x2,y2,...,xn,yn].
    // https://leetcode.com/problems/shuffle-the-array/

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7}; 
        int n = nums.length/2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
   
        static int[] shuffle(int[] nums, int n) {
            int[] result = new int[nums.length];
            for (int i = 0; i < n; i++) {
                result[i*2] = nums[i];
                result[i*2+1] = nums[i+n];
            }
            return result;
        }
    

}
