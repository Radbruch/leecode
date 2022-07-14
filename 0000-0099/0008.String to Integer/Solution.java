public class Solution {
    public static int myAtoi(String s) {
        Integer positive = 1;
        String s1 = "";
        String onoroff = "off";
        for (Integer index = 0; index < s.length(); index++) {
            Character c = s.charAt(index);
            if (c == ' ' && onoroff == "off") {
                continue;
            }
            else if (c == '+' && onoroff == "off") {
                positive = 1;
                onoroff = "on";
            }
            else if (c == '-' && onoroff == "off") {
                positive = 0;
                onoroff = "on";
            }
            else if (Character.isDigit(c)) {
                s1 += c;
                onoroff = "on";
            }
            else {
                break;
            }
        }
        if (s1 == "") {
            return 0;
        }
        else {
            try {
                if (positive == 0) {
                    Integer ints = -Integer.valueOf(s1);
                } else {
                    Integer ints = Integer.valueOf(s1);
                }
            } catch (Exception e) {
                if (positive == 0) {
                    return (int) -Math.pow(2, 31);
                } else {
                    return (int) Math.pow(2, 31);
                }
            }
            if (positive == 0) {
                return -Integer.valueOf(s1);
            } else {
                return Integer.valueOf(s1);
            }
        }
    }
}
