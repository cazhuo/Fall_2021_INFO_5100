package midterm;

import java.util.HashMap;

public class Midterm_Q4 {

    public static String lengthOfLongestSubstring(String s) {

        /*
         Input: s = "abcabcbb"
         Output: 3
         Explanation: The answer is "abc", with the length of 3.
         */

        if (s.length() == 0) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, max = 0;
        String ans = "";

        for (int j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                // if repeating char found, update i
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);

            if (j + 1 - i > max) {
                ans = s.substring(i, j + 1);
            }

            // keep updating max here
            max = Math.max(max, j - i + 1);
        }

        return ans;
    }
}




