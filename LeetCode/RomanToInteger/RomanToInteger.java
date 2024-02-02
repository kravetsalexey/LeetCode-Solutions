package LeetCode.RomanToInteger;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        int value =0;
        for (int i = s.length()-1; i >= 0; i--) {
                int now = map.get(s.charAt(i));
                if (now >= value)
                    result += now;
                else
                    result -= now;
                value = now;
        }
        return result;
    }
}
