package elementary.array;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        /*
        * 此方法为一种动态规划算法，即只要后面一个数字比前面的大，就将其差值
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
}

class Main{
    public static void main(String[] args){
        MaxProfit maxProfit = new MaxProfit();
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit.maxProfit(nums));
    }
}
