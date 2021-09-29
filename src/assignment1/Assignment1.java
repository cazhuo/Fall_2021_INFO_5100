package assignment1;

public class Assignment1 {

    // Q1:
    // T: O(n); S: O(1)
    public int sumOfUnique(int[] nums) {
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




}
