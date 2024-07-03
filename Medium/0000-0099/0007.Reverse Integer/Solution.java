public class Solution {
    private static int positivereverse(int x) {
        String xtostr = Integer.toString(x);
        String xreversestr = "";
        for (int index = 0; index < xtostr.length(); index++) {
            xreversestr = xtostr.charAt(index) + xreversestr;
        }
        try {
            Integer xreverse = Integer.valueOf(xreversestr);
        } catch (Exception e) {
            return 0;
        }
        Integer xreverse = Integer.valueOf(xreversestr);
        return xreverse;
    }
    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        else if (x > Math.pow(2, 32)) {
            return 0;
        }
        else if (x > 0) {
            // if (Integer.toBinaryString(x).length() > 64) return 0;
            String binaryxreverse = Integer.toBinaryString(positivereverse(x));
            if (binaryxreverse.length() > 32) {
                return 0;
            }
            else {
                return positivereverse(x);
            }
        }
        else {
            Integer negtivexreverse = positivereverse(-x);
            Integer xreverse = -negtivexreverse;
            String binaryxreverse = Integer.toBinaryString(xreverse);
            if (binaryxreverse.length() > 32) {
                return 0;
            }
            else {
                return xreverse;
            }
        }
    }
}
