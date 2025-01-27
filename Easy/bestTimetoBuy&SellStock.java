class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0, j = 1;
        while (j < prices.length && prices.length > 1) {
            int pnl = prices[j] - prices[i];
            profit = Math.max(profit, pnl);
            System.out.print("i: " + i + " j: " + j + " pnl: " + pnl + " profit: " + profit + " \n");
            if (pnl <= 0) {
                if (i == (j - 1)) {
                    i++;
                    j++;
                } else {
                    i++;
                }

            } else {
                j++;
            }
        }
        return profit;
    }
}
