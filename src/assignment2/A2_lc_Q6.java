package assignment2;

import java.util.HashMap;

public class A2_lc_Q6 {
    // T: O(n)
    // S: 0(n)
    public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> map = new HashMap<>();
            for (int i=0; i<s.length(); i++) {
                char a = s.charAt(i);
                char b = t.charAt(i);
                if (map.containsKey(a)) {
                    if (map.get(a) == b) {
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    if (!map.containsValue(b)) {
                        map.put(a, b);
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
}
