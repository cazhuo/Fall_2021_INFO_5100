package assignment2;

public class A2_lc_Q7 {
    // T: O(n)
    // S: 0(n)
    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            res.append(sum % 10);
            carry = sum/10;
        }

        if (carry > 0) {
            res.append(carry);
        }

        return res.reverse().toString();
    }
}
