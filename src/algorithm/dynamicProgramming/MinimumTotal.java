package algorithm.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class MinimumTotal {
    public static int minimumTotal(List<List<Integer>> triangle){
        int m = triangle.size();
        int n = 0;
        int[] dp = new int[m];
        for (int i = 0; i < m; i++){
            List<Integer> temp = triangle.get(i);
            if (i == 0){
                dp[i] = temp.get(0);
            }
            else if (temp.get(n) > temp.get(n + 1)){
                dp[i] = dp[i-1] + temp.get(n + 1);
                n++;
            } else if (temp.get(n) < temp.get(n + 1)) {
                dp[i] = dp[i-1] + temp.get(n);
            }
        }
        return dp[m - 1];
    }

    public static int min(List<List<Integer>> triangle){
        int m = triangle.size();
        int n = triangle.get(m-1).size();
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++){
            List<Integer> temp = triangle.get(i);
            for (int j = 0; j < i + 1; j++){
                int val = temp.get(j);
                dp[i][j] = Integer.MAX_VALUE;
                if (i == 0){
                    dp[i][j] = temp.get(0);
                }else{
                    if (j != 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1] + val);
                    }
                    if (j != i){
                        dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + val);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++){
            ans = Math.min(ans, dp[n - 1][i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        List<Integer> temp3 = new ArrayList<>();
        temp.add(2);
        triangle.add(temp);
        temp1.add(3);
        temp1.add(4);
        triangle.add(temp1);
        temp2.add(6);
        temp2.add(5);
        temp2.add(7);
        triangle.add(temp2);
        temp3.add(4);
        temp3.add(1);
        temp3.add(8);
        temp3.add(3);
        triangle.add(temp3);
        System.out.println(min(triangle));
    }
}
