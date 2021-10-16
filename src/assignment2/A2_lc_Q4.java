package assignment2;

public class A2_lc_Q4 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
		/* What below loop does is - gets transpose of the matrix -
		means rows value are interchanged with column values .
		1 2 3        1 4 7
		4 5 6  -->   2 5 8
		7 8 9        3 6 9
		*/
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){ // j<=i - this statement here is imp - otherwise you will end up with the original matrix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        /* Now our matrix is transposed -
		so we will reverse each row individually
		1 4 7           7 4 1
		2 5 8    -->    8 5 2
		3 6 9           9 6 3
		*/
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){  // j<n/2 otherwise while reversing we will end up with the original row - so reverse till half of the row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}
