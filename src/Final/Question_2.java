package Final;

import java.util.*;

public class Question_2 {
    public static List<List<String>> groupAnagrams(String[] strs) {

        // 1. if strs length == 0
        if (strs.length == 0) return new ArrayList<>();

        // 2. if strs length != 0
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            // if key not in map -> new Array, add s; else, add s
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        String[] input1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("expected : [bat] [nat, tan] [ate, eat, tea] (in any order)");
        for (List<String> ans : groupAnagrams(input1)) {
            System.out.print(Arrays.toString(ans.toArray()));
        }
        System.out.println();

        String[] input2 = {" "};
        System.out.println("expected : [ ] (in any order)");
        for (List<String> ans : groupAnagrams(input2)) {
            System.out.print(Arrays.toString(ans.toArray()));
        }
        System.out.println();

        String[] input3 = {"a"};
        System.out.println("expected : [a] (in any order)");
        for (List<String> ans : groupAnagrams(input3)) {
            System.out.print(Arrays.toString(ans.toArray()));
        }
        System.out.println();

    }

}
