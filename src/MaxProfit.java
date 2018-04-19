public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i] - prices[i - 1]) > 0)
                max += (prices[i] - prices[i - 1]);
        }
        return max;
    }
}
