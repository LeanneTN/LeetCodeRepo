package algorithm.dynamicProgramming;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for (int i = 0; i < n; i++){
            int buy = prices[i];
            int sale = 0;
            for (int j = i + 1; j < n; j++){
                sale = prices[j];
                if ((sale - buy) > profit){
                    profit = sale - buy;
                }
            }
        }
        return profit;
    }

    public static int maxProfitDynamic(int[] prices){
        if (prices == null || prices.length == 0){
            return 0;
        }
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);
        }
        return dp[n-1][0];
    }

    public static void main(String[] args) {
        int[] input = {7,1,5,3,6,4};
        System.out.println(maxProfitDynamic(input));
    }
}
