package midterm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Midterm_Q3 {
    public static int SumOfRepeated(int[] array) {
        /*
        Input : array = {1,3,-1,3,4,-1}
        Output : 3 + (-1) = 2
         */
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < array.length; i++) {
            if (! map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], (map.get(array[i]) + 1));
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                ans += key;
            }
        }

        return ans;
    }

}
