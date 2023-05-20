package algorithm.dynamicProgramming;

public class MinPathSum {
    int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] f = new int[m][n];
        f[0][0] = grid[0][0];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if (i > 0 && j > 0){
                    f[i][j] = f[i][j] + Math.min(f[i-1][j], f[i][j-1]);
                }else if (i > 0){
                    f[i][j] = f[i][j] + f[i-1][j];
                }else if (j > 0){
                    f[i][j] = f[i][j] + f[i][j-1];
                }
            }
        }
        return f[m-1][n-1];
    }
}
