import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        // Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
        // https://leetcode.com/problems/concatenation-of-array/description/
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    
        static int[] getConcatenation(int[] nums) {
            int[] ans = new int[2*nums.length];
           for(int i = 0;i<nums.length;i++){
                ans[i]=nums[i];
                ans[i+nums.length]=nums[i];
           }
           return ans;
    
        }
    }

