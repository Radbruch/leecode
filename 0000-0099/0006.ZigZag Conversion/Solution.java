import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    private static class treenode{
        Character name;
        treenode parent;
        List<treenode> children = new ArrayList<>();

        private treenode(Character name, treenode parent){
            this.name = name;
            this.parent = parent;
        }

        private treenode(Character name) {
            this.name = name;
        }

        private Character getName() {
            return name;
        }

        private treenode getParent() {
            return this.parent;
        }

        private List<treenode> getChildren() {
            return this.children;
        }

        private void addChildren(treenode child) {
            this.children.add(child);
        }

        private String levelOrder(treenode treenode) {
            Queue<treenode> queue = new LinkedList<>();
            String ans = "";
            queue.add(treenode);
            while (queue.size() > 0) {
                treenode node = queue.poll();
                ans += node.name;
                List<treenode> children = node.children;
                for (treenode child: children) {
                    queue.add(child);
                }
            }
            return ans.substring(1);
        }

    }
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        else if (numRows == 2) {
            String s1 = "";
            String s2 = "";
            for (Integer index = 0; index < s.length(); index++) {
                if (index % 2 == 0) {
                    s1 += s.charAt(index);
                }
                else {
                    s2 += s.charAt(index);
                }
            }
            return s1+s2;
        }
        else {
            treenode sTree = new treenode('0');
            treenode Pointer = sTree;
            Integer deep = 0;
            Integer index = 0;
            Integer UpOrDown = 1;
            Integer numOfAdd = 0;
            while (numOfAdd != s.length()) {
                if (deep == 0) {
                    Pointer.children.add(new treenode(s.charAt(index), Pointer));
                    numOfAdd++;
                    deep++;
                    index++;
                    UpOrDown = 1;
                    Pointer = Pointer.children.get(Pointer.children.size() - 1);
                } else if (deep != numRows && UpOrDown == 1) {
                    Pointer.children.add(new treenode(s.charAt(index), Pointer));
                    numOfAdd++;
                    deep++;
                    index++;
                    Pointer = Pointer.children.get(0);
                } else if (deep == numRows) {
                    Pointer = Pointer.parent;
                    Pointer = Pointer.parent;
                    Pointer.children.add(new treenode(s.charAt(index), Pointer));
                    numOfAdd++;
                    deep--;
                    index++;
                    UpOrDown = 0;
                } else if (deep > 2 && UpOrDown == 0) {
                    Pointer = Pointer.parent;
                    Pointer.children.add(new treenode(s.charAt(index), Pointer));
                    numOfAdd++;
                    deep--;
                    index++;
                } else if (deep == 2 && UpOrDown == 0) {
                    Pointer = sTree;
                    deep = 0;
                } else {
                }
            }
            return sTree.levelOrder(sTree);
        }
    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        Integer numRows = 2;
        System.out.println(convert(s, numRows));
    }
}