public class ProductArray {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        productExceptSelf(nums);
    }
    
        static int[] productExceptSelf(int[] nums) {
            int multiply = 1;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]!=0){
                    multiply *= nums[i];
                }
            }
          
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 0){
                    nums[i] = multiply;
                }
                else{
                    nums[i] = multiply/nums[i];
                }
            }
            return nums;
        }
    }

