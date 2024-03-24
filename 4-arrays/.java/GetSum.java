import java.util.Arrays;

public class GetSum {
    public static void main(String[] args) {
        // Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
        // https://leetcode.com/problems/running-sum-of-1d-array/
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
    }
    static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length; i++ ){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}

