import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Deque<Character> paren = new ArrayDeque<>();
        
        for(int i = 0; i<s.length(); i++){
            if(paren.size() == 0){
                paren.add(s.charAt(i));
                continue;
            }
            
            int left = paren.peekLast();
            int right = s.charAt(i);
            
            if(right - 1 == left ){
                paren.pop();
            }else{
                paren.add(s.charAt(i));
            }
        }
        
        if(paren.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}