package assignment2;

import java.util.ArrayList;
import java.util.List;

public class A2_lc_Q5 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length==0 || matrix[0].length==0) return res;
        int b = matrix.length-1, r = matrix[0].length-1, t=0,l=0;

        while(t<=b && l<=r){
            //Right
            for(int j=l;j<=r;j++)
                res.add(matrix[t][j]);
            t++;
            //Down
            for(int i=t;i<=b;i++)
                res.add(matrix[i][r]);
            r--;
            //Left
            for(int j=r;j>=l && t<=b;j--)
                res.add(matrix[b][j]);
            b--;
            //Up
            for(int i=b;i>=t && l<=r;i--)
                res.add(matrix[i][l]);
            l++;
        }
        return res;
    }
}
