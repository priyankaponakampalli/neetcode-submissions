class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            int current = prices[i] - buy;

        if (current > profit) {
            profit = current;
        }
        }
        return profit;
    }
}
