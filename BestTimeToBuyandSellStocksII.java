package CrackYourPlacementDay13;

public class BestTimeToBuyandSellStocksII {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] prices3 = {7, 6, 4, 3, 1};
        int[] prices4 = {7, 1, 2, 3, 6, 1};

        System.out.println("Max profit for prices1: " + maxProfit(prices1)); // Output: 7
        System.out.println("Max profit for prices2: " + maxProfit(prices2)); // Output: 4
        System.out.println("Max profit for prices3: " + maxProfit(prices3)); // Output: 0
        System.out.println("Max profit for prices4: " + maxProfit(prices4)); // Output: 5
    }
}
