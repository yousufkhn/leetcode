//mylogic

class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack outputStack = new Stack();
        ArrayList<String> output = new ArrayList<>();
        int targetIndexCount = 0;

        for (int i = 1; i <= n; i++) {
            int currentElement = target[targetIndexCount];

            if (i == currentElement) {
                int lastPushed = i;
                outputStack.push(i);
                output.add("Push");
                if (lastPushed == target[target.length - 1]) {
                    break;
                }
                targetIndexCount++;
            } else if (i != currentElement) {
                output.add("Push");
                output.add("Pop");

            }

        }
        return output;
    }
}