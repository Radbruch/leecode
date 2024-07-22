
import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ((c == '(') || (c == '{') || (c == '[')) {
                    stack.add(c);
            }
            else{
                    if (stack.empty()) {
                        return false;
                    }
                    if (c == ')' && stack.pop() != '(') {
                        return false;
                    }
                    if (c == '}' && stack.pop() != '{') {
                        return false;
                    }
                    if (c == ']' && stack.pop() != '[') {
                        return false;
                    } else continue;
                }

            }
        if (stack.empty()) return true;
        return false;
        }
    }