import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int n : arr){
            if(!stack.isEmpty() && stack.peek().equals(n)){
                continue;
            }
            stack.push(n);
        }
        
        int[] arr1 = new int[stack.size()];
        int i = 0;
        for(int n1 : stack){
            arr1[i++] = n1;
        }
        
        return arr1;
    }
}