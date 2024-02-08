package LeetCode.Easy.LongestCommonPrefix;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] s = {"flower","flower","flowwer"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int k=0;
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            k = i;
        }
        return first.substring(0,k+1);
    }
}
