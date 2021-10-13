package assignment2;

public class A2_lc_Q3 {
    // T: O(n)
    // S: 0(1)
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n==1) return;

        int l=0, r=0;
        int temp;
        while (r<n) {
            if (nums[r]==0) {
                r++;
            }else{
                temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r++;
            }
        }
    }
}
