class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxDistance;
        int rightMin;
        if (right.length == 0) {
            rightMin = n;
        } else {
            rightMin = right[0];
        }

        int leftMax = 0;
        for (int i = 0; i < right.length; i++) {
            if (right[i] < rightMin) {
                rightMin = right[i];
            }
        }
        rightMin = n - rightMin;
        for (int i = 0; i < left.length; i++) {
            if (left[i] > leftMax) {
                leftMax = left[i];
            }
        }
        maxDistance = Math.max(rightMin, leftMax);
        return maxDistance;

    }
}