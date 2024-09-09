import java.util.ArrayList;

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        char[] ch = s.toCharArray();
        int maxnum = 0;
        int newnum = 0;
        ArrayList<Character> calstr = new ArrayList();
        for (int i = 0; i < ch.length; i++) {
            if (calstr.contains(ch[i])) {
                if (newnum > maxnum) maxnum = newnum;
                calstr.add(ch[i]);
                int index = calstr.indexOf(ch[i]);
                for (int j = 0; j <= index; j++) {
                    calstr.remove(0);
                    newnum = calstr.size();
                }
            }

            else {
                calstr.add(ch[i]);
                newnum++;
                if (newnum > maxnum) maxnum = newnum;
            }
        }
        return maxnum;
    }
}


