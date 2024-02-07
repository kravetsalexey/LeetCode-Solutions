package LeetCode.LongestSubstring;

public class LongestSubstring3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

/*   Best solution 2ms runtime */

//    public static int lengthOfLongestSubstring(String s){
//        int maxLen = 0;
//        int[] pos = new int[128];
//        int start = 0, end = 0;
//
//        for (char ch : s.toCharArray()) {
//            start = Math.max(start, pos[ch]);
//            maxLen = Math.max(maxLen, end - start + 1);
//            pos[ch] = end + 1;
//            end++;
//        }
//        return maxLen;
//    }
//}

        /* My Solution 265ms runtime */
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()){
            return 0;
        }
        if (s.length()==1){
            return 1;
        }
        String temp = s.substring(0,1);
        int count;
        int k =0;
        int max = 1;
        for (int i = 1; i <= s.length()-1;i++){
            String s1 = String.valueOf(s.charAt(i));
            count = temp.length();
            if (temp.contains(s1)) {
                k++;
                temp = String.valueOf(s.charAt(k));
                i=k;
                if (max <= count) {
                    max = count;
                    count = 0;
                }
            } else {
                temp = temp.concat(s1);
            }
        }
        if (s.equals(temp)){
            max = s.length();
        } else {
            if (temp.length() > max)
                max = temp.length();
        }
        return max;
    }
}
