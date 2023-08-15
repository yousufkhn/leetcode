
//brute force

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int s = nums.length;

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
        }
        return null;
    }
}

// hash map

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int s = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < s; i++) {
            int comp = target - nums[i];
            if (numMap.containsKey(comp)) {
                return new int[] { numMap.get(comp), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return null;
    }
}
//