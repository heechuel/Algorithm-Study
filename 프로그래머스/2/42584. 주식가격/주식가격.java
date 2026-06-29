import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] result = new int[prices.length];
        
        int count = 0;
        
        for(int price : prices){
            count++;
            
            while(!stack.isEmpty() && stack.peekLast()[1] > price ){
                int idx = stack.pollLast()[0];
                result[idx - 1] = count - idx;
            }
            stack.offerLast(new int[]{count, price});
        }
        
        while(!stack.isEmpty()){
            int[] n = stack.pollFirst();
            result[ (n[0] - 1 )] = count - n[0];
        }
        
        return result;
    }
}