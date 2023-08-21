class Solution {

    public static boolean inc(int[] nums){
            for (int i = 1;i<nums.length;i++){
                if (nums[i-1]>nums[i]){
                    return false;
                }
            }
            return true;
        }
    public static boolean dec(int[] nums){
            for (int i = 1;i<nums.length;i++){
                if (nums[i-1]<nums[i]){
                    return false;
                }
            }
            return true;
        }

    public boolean isMonotonic(int[] nums) {
        return inc(nums) || dec(nums);
    }
}