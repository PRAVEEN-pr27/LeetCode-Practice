public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // calculate profit if sold today
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            
            // update minPrice if current is lower
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
