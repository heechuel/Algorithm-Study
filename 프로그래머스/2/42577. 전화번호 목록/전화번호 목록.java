import java.util.*;
class Solution {
    static class Node{
        HashMap<Character, Node> child = new HashMap<>();
        boolean isEnd = false;
    }
    public boolean solution(String[] phone_book) {
        Node root = new Node();
        
        for(String phone : phone_book){
            Node cur = root;
            for(char c : phone.toCharArray()){
                cur = cur.child.computeIfAbsent(c, k -> new Node());
            }
            cur.isEnd = true;
        }
        
        for(String phone : phone_book){
            Node cur = root;
            for(int i = 0; i < phone.length() - 1; i++){
                cur = cur.child.get(phone.charAt(i));
                if(cur.isEnd) return false;
            }
        }
        return true;
    }
    
    
}