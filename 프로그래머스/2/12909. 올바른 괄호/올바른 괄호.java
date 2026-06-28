import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        
        char[] ch = s.toCharArray();
        
        for(char c : ch){
            if(deque.isEmpty() && c == ')' ){
                return false;
            }
            
            if(c ==  '(' ) deque.addLast(c);
            else deque.pollLast();
        }
        
        if(deque.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}