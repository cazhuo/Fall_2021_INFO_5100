package assignment2;

public class A2_lc_Q1 {
    // T: O(m*n)
    // S: 0(m*n)
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] ans = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
