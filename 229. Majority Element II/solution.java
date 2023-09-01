class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        int arrCount=0;
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                count++;
            }
            else{
                count = 1;
            }
            if (count > (nums.length/3)){
                list.add(nums[i]);
            }
        }
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        return newList;
    }
}