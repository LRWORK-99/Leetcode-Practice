class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        /** Brute force method - Not efficient - O(n^2)
         *         int maxProfit = 0;
         *
         *         for (int i = 0; i < prices.length; i++) {
         *             for (int j = i + 1; j < prices.length; j++) {
         *                 if (prices[j] > prices[i]) {
         *                     maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
         *                 }
         *             }
         *         }
         *
         *         return maxProfit;
         */

        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i=1; i<prices.length; i++) {
            if (prices[i] > minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            } else {
                minPrice = prices[i];
            }
        }

        return maxProfit;

    }
}