import java.util.*;
class Solution {
    static class Node{
        HashMap<Character, Node> child = new HashMap<>();
        boolean isEnd = false;
    }
    
    public boolean solution(String[] phone_book) {
        Node root = new Node();
        for(String p : phone_book){
            Node cur = root;
            for(char c : p.toCharArray())
                cur = cur.child.computeIfAbsent(c, k-> new Node());
            cur.isEnd=true;
        }
        for(String p : phone_book){
            Node cur = root;
            for(int i =0; i<p.length()-1; i++){
                cur = cur.child.get(p.charAt(i));
                if(cur.isEnd) return false;
            }
        }
        return true;
    }
}