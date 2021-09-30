package assignment1;

import java.util.HashMap;
import java.util.Map;

public class Assignment1 {

    // Q1:
    // T: O(n); S: O(1)
    public static int sumOfUnique(int[] nums) {
        int[] record = new int[101];
        int sum=0;
        for (int i=0; i<nums.length; i++) {
            if (record[nums[i]] == 0 ) {
                sum+=nums[i];
                record[nums[i]]=1;
            }else{
                if (record[nums[i]] == 1 ) {
                    sum-=nums[i];
                    record[nums[i]] = 2;
                }
            }
        }
        return sum;
    }

    // Q2:
    // T: O(n); S: O(n)
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int beg = 0, end = n-1, i = n-1;
        while (i>=0) {
            if (nums[beg] * nums[beg] > nums[end] * nums[end]) {
                res[i] = nums[beg] * nums[beg];
                i--;
                beg ++;
            } else {
                res[i] = nums[end] * nums[end];
                i --;
                end --;
            }
        }
        return res;
    }

    // Q3:
    // T: O(n); S: O(n)
    public static int firstNonRepeating(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        // Traverse array again and return first element with count 1.
        for (int i = 0; i < n; i++) {
            if (m.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }




}
