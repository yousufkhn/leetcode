class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        int[] nums2 = new int[j + 1];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums2[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            nums[i] = nums2[i];
        }
        return k;
    }
}