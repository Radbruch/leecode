class Solution {
    public String longestPalindrome(String s) {
        String longestPLD = "";
        String PLD = "";
        int leftlength = 0;
        int rightlength = 0;
        int sublength = 0 ;
        if (s.length() == 0) return "";
        if (s.length() == 1) return s;
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) return s;
            else return "" + s.charAt(0);
        }
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-1 && (s.charAt(i) == s.charAt(i+1))) {
                leftlength = i;
                rightlength = s.length()-i-2;
                sublength = mininteger(leftlength, rightlength);
                PLD = extend(s, i, i+1, sublength);
                if (PLD.length() > longestPLD.length()) longestPLD = PLD;
            }
            leftlength = i;
            rightlength = s.length()-i-1;
            sublength = mininteger(leftlength, rightlength);
            PLD = extend(s, i, sublength);
            if (PLD.length() > longestPLD.length()) longestPLD = PLD;
        }
        return longestPLD;
    }

    private static String extend(String s, int startIndex, int length) {
        String PLD = "" + s.charAt(startIndex);
        for (int i = 1; i <= length; i++) {
            if (s.charAt(startIndex-i) != s.charAt(startIndex+i)) {
                return PLD;
            }
            else {
                PLD = s.charAt(startIndex-i) + PLD + s.charAt(startIndex+i);
            }
        }
        return PLD;
    }

    private static String extend(String s, int startIndex, int rightToStart, int length) {
        String PLD = "" + s.charAt(startIndex) + s.charAt(rightToStart);
        for (int i = 1; i <= length; i++) {
            if (s.charAt(startIndex-i) != s.charAt(rightToStart+i)) {
                return PLD;
            }
            else {
                PLD = s.charAt(startIndex-i) + PLD + s.charAt(rightToStart+i);
            }
        }
        return PLD;
    }


    private static int mininteger(int a, int b) {
        if (a < b) {
            return a;
        }
        else return b;
    }
}


