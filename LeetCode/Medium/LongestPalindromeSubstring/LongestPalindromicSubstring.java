package LeetCode.Medium.LongestPalindromeSubstring;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abdbdba"));
    }

    public static String longestPalindrome(String s){
        String result = s.substring(0,1);

        return result;
    }

//    public static String longestPalindrome(String s) {
//        if (s.length()<=1){
//            return s;
//        }
//        int maxLen =1;
//        String result =s.substring(0,1);
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i+maxLen; j < s.length(); j++) {
//                if (j-i>maxLen && isPalindrome(s.substring(i,j))){
//                    maxLen = j-i;
//                    result = s.substring(i,j);
//                }
//            }
//        }
//        return result;
//    }
//
//    private static boolean isPalindrome(String s){
//        int left=0;
//        int right = s.length()-1;
//        while (left >right){
//            if (s.charAt(left)!=s.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
}
