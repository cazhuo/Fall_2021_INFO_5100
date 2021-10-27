package midterm;

import java.util.HashMap;

public class Midterm_Q4 {

    public static String lengthOfLongestSubstring(String s) {

        /*
         Input: s = "abcabcbb"
         Output: 3
         Explanation: The answer is "abc", with the length of 3.
         */
            if (s.length() == 0)  return " ";

            HashMap<Character, Integer> map = new HashMap<>();
            int ans = 0, i = 0;

            for (int j = 0; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(i, map.get(s.charAt(j)));
                }

                map.put(s.charAt(j), j+1);
                ans = Math.max(ans, j+1-i);
            }

            return s.substring(0, ans);

        }
}




