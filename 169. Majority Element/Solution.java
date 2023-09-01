// brute force

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int count = 0;
//         for (int i = 0;i<nums.length;i++){
//             if (i > 0 && nums[i] == nums[i - 1]){
//                 count++;
//             }
//             else{
//                 count = 1;
//             }
//             if (count > (nums.length/2)){
//                 return nums[i];
//             }
//         }
//         return 0;
//     }
// }

// O(1) solution

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}