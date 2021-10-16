package assignment2;

public class A2_lc_Q2 {
    // T: O(m*n)
    // S: 0(1)
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int result = Integer.MAX_VALUE;
        int a = -1;
        int b = -1;
        for (int i = 0; i< wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                a = i;
            }else if (wordsDict[i].equals(word2)) {
                b = i;
            }
            if(a!=-1 && b !=-1){
                result = Math.min(result, Math.abs(a-b));
            }
        }
        return result;
    }
}
