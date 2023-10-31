class Solution {
    public int maxProfit(int[] prices) {
        int leastSoFar = Integer.MAX_VALUE;
        int profit=0;
        int maxProfit=0;

        for (int i =0;i<prices.length;i++){
            if (prices[i]<leastSoFar){
                leastSoFar = prices[i];
            }
            profit = prices[i]-leastSoFar;
            if (maxProfit<profit){
                maxProfit=profit;
            }
        }
        
        return maxProfit;
    }
}