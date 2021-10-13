package assignment2;

public class A2_lc_Q9 {
    // T: O(n)
    // S: 0(n)
    public String reverseWords(String s) {
        if (s==null || s.length()==0) {
            return s;
        }
        if (s.trim().length()==0) {
            return s.trim();
        }

        s = s.trim();
        String []ss = s.split(" ");
        String newS = "";
        for (int i=ss.length-1; i>=1; i--){
            if (ss[i].equals("")){
                continue;
            }
            newS = newS + ss[i]+" ";
        }
        newS = newS+ss[0];
        return newS;
    }
}

