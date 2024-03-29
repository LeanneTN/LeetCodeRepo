package algorithm.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinFallingPathSum {
    public static int minFallingPathSum(int[][] matrix){
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++){
            dp[0][i] = matrix[0][i];
        }
        for (int i = 1; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == 0){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j+1]) + matrix[i][j];
                }else if (j == n - 1){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-1]) + matrix[i][j];
                }else{
                    int val = Integer.MAX_VALUE;
                    for (int k = j - 1; k <= j + 1; k++){
                        val = Math.min(val, dp[i-1][k]);
                    }
                    dp[i][j] = matrix[i][j] + val;
                }
            }
        }
        int val = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            val = Math.min(val, dp[n-1][i]);
        }
        return val;
    }

    public static int minFallingPathSum2(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++){
            dp[0][i] = grid[0][i];
        }
        for (int i = 1; i < n; i++){
            for (int j = 0; j < n; j++){
                dp[i][j] = Integer.MAX_VALUE;
                int val = grid[i][j];
                for (int k = 0; k < n; k++){
                    if (j != k){
                        dp[i][j] = Math.min(dp[i][j], dp[i-1][k] + val);
                    }
                }
            }
        }
        int val = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            val = Math.min(val, dp[n-1][i]);
        }
        return val;
    }

    public static int minFallingPathSum3(int[][] grid){
        int n = grid.length;
        int[][] dp = new int[n][n];
        int i1 = -1, i2 = -1;
        for (int i = 0; i < n; i++){
            int val = grid[0][i];
            if (val < (i1 == -1 ? Integer.MAX_VALUE : dp[0][i])){
                i2 = i1;
                i1 = i;
            }else if (val < (i2 == -1 ? Integer.MAX_VALUE : dp[0][i2])){
                i2 = i;
            }
        }
        for (int i = 1; i < n; i++){
            int ti1 = -1, ti2 = -1;
            for (int j = 0; j < n; j++){
                dp[i][j] = Integer.MAX_VALUE;
                int val = grid[i][j];
                if (j != i1){
                    dp[i][j] = dp[i-1][i1] + val;
                }else {
                    dp[i][j] = dp[i-1][i2] + val;
                }
                if (dp[i][j] < (ti1 == -1 ? Integer.MAX_VALUE : dp[i][ti1])){
                    ti2 = ti1;
                    ti1 = j;
                } else if (dp[i][j] < (ti2 == -1 ? Integer.MAX_VALUE : dp[i][ti2])) {
                    ti2 = j;
                }
            }
            i1 = ti1;
            i2 = ti2;
        }
        int val = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            val = Math.min(val, dp[n-1][i]);
        }
        return val;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {2,2,1,2,2},{2,2,1,2,2},{2,2,1,2,2},{2,2,1,2,2},{2,2,1,2,2}
        };
        int[][] grid = new int[][]{
                {7}
        };
        System.out.println(minFallingPathSum3(matrix));
    }
}
