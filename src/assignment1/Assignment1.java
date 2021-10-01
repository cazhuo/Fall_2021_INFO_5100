package assignment1;

import java.util.HashMap;
import java.util.Map;

public class Assignment1 {

    // Q1:
    // T: O(n); S: O(n)
    public static int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!m.containsKey(nums[i])) {
                m.put(nums[i], 1);
                sum += nums[i];
            } else {
                m.put(nums[i], m.get(nums[i]) + 1);
            }

            if (m.get(nums[i]) == 2) {
                sum -= nums[i];
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

    // Q4:
    // T: O(n); S: 0(1)
    public static boolean canConstruct(String ransomNote, String magazine) {
        char arr[] = new char[26];
        for (int i=0; i<magazine.length(); i++) {
            arr[magazine.charAt(i)-'a']++;
        }
        for (int i=0; i<ransomNote.length(); i++) {
            if (arr[ransomNote.charAt(i) - 'a'] != 0) {
                arr[ransomNote.charAt(i) - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }

    // Q5:
    // T: O(n); S: O(1)
    public static boolean isPattern(String letterDigit) {
        int n = letterDigit.length();
        if (n==0) return false;
        for (int i=0; i<n-1; i++) {
            if (Character.isDigit(letterDigit.charAt(i))
                    && Character.isDigit(letterDigit.charAt(i + 1))) {
                return false;
            } else if (Character.isLetter(letterDigit.charAt(i))
                    && Character.isLetter(letterDigit.charAt(i + 1))) {
                return false;
            }
        }
        return true;
    }




}
