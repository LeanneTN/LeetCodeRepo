package elementary.array;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        /*
        * 此方法为一种贪心算法，即只要后面一个数字比前面的大，就将其差值
        * 加入总和中，以达到sum的最大值
        * */
        int sum = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i+1] - prices[i] > 0){
                sum += (prices[i+1] - prices[i]);
            }
        }
        return sum;
    }

    public int dynamic(int[] prices){
        int len = prices.length;
        if(len < 2){
            return 0;
        }

        //stock's state:  state 0: cash   state 1: stock0
        //cash: cash we have in day i and stock state is j
        int[][] cash = new int[len][2];
        // initial state
        cash[0][0] = 0;
        cash[0][1] = -prices[0];
        for(int i = 1; i < len; i++){
            cash[i][0] = Math.max(cash[i-1][0], cash[i-1][1] + prices[i]);
            cash[i][1] = Math.max(cash[i-1][1], cash[i-1][0] - prices[i]);
        }
        return cash[len-1][0];
    }
}

class Main{
    public static void main(String[] args){
        MaxProfit maxProfit = new MaxProfit();
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit.dynamic(nums));
    }
}
