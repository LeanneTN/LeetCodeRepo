package elementary.array;

public class Rotate {
    public void rotate(int[][] matrix) {
        // considering element i_j in matrix, after rotate, it will go to position j_n-i-1
        // and use flip to replace rotate
        int n = matrix.length;
        for(int i = 0; i < n / 2; ++i){
            for(int j = 0; j < n; ++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-i-1][j];
                matrix[n-i-1][j] = temp;
            }
        }
        for (int i = 0; i < n; ++i){
            for(int j = 0; j < i; ++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [][] a = new int[3][4];
        a[0][0] = 0;
        a[0][1] = 1;
        a[0][2] = 2;
        a[0][3] = 3;
        System.out.println(a.length);
        for(int i = 0; i < 4; ++i){
            System.out.println(a[0][i] + " " + i);
        }
    }
}
