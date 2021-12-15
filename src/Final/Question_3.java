package Final;

import java.util.HashMap;

public class Question_3 {
    public static int continuousSubarraySum(int[] nums, int k) {
        // record cumulative sum in a hashtable
        int count = 0, sum = 0;
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);
        // keep storing the pair <sum, # of times this sum has occurred>
        // if sum - k == 0 till curr index, we've seen subarray(s) sum to k
        // could be more than one, hence count += map.get(sum - k)
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sumMap.containsKey(sum - k)) {
                count += sumMap.get(sum - k);
            }
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] inputArray1 = {1,1,1};
        int inputInt1 = 2;
        System.out.println("expected : 2");
        System.out.println(continuousSubarraySum(inputArray1, inputInt1));
        System.out.println();

        int[] inputArray2 = {1,2,3};
        int inputInt2 = 3;
        System.out.println("expected : 2");
        System.out.println(continuousSubarraySum(inputArray2, inputInt2));
        System.out.println();

        int[] inputArray3 = {5};
        int inputInt3 = 3;
        System.out.println("expected : 0");
        System.out.println(continuousSubarraySum(inputArray3, inputInt3));
        System.out.println();
    }
}

// TC : O(n) nums array traversed once.
// SC : O(n) worst case, Hashmap has n distinct entries.


