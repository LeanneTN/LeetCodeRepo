package algorithm.graph;

public class FindCircleNum {
    public static int findCircleNum(int[][] isConnected){
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int province = 0;
        for (int i = 0; i < n; i++){
            if (!visited[i]){
                dfs(isConnected, visited, n, i);
                province++;
            }
        }
        return province;
    }

    public static void dfs(int[][] isConnected, boolean[] visited, int cities, int i){
        for (int j = 0; j < cities; j++){
            if (isConnected[i][j] == 1 && !visited[j]){
                visited[j] = true;
                dfs(isConnected, visited, cities, j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {
                {1,1,0},{1,1,0},{0,0,1}
        };
        System.out.println(findCircleNum(isConnected));
    }
}
