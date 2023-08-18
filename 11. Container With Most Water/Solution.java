class Solution {
    public int maxArea(int[] height) {

        // brute force, this has time complexity of O(n^2) and only passes 55/60 test
        // cases
        // int maxVol=0;
        // for (int i=0;i<height.length;i++){
        // for (int j=0;j<height.length;j++){
        // int smallerNum =
        // (height[i]==height[j])?height[i]:(height[i]<height[j])?height[i]:height[j];
        // if (smallerNum*(j-i)>maxVol){
        // maxVol = smallerNum * (j-i);
        // }
        // }
        // }
        // return maxVol;

        // this solution is using pointers
        // maintaining two pointers from each side of the array comparing the maxVol
        int maxVol = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int smallerNum = Math.min(height[left], height[right]);
            int width = right - left;
            maxVol = Math.max(maxVol, smallerNum * width);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxVol;
    }
}