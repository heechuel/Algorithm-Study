import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;
        int count = 1;
        
        for(int num : priorities){
            que.add(num);
        }
        
        while(!que.isEmpty()){
            
            if(priorities[i] == que.peek()){
                que.poll();
                priorities[i] = (10 + count++);
            }
            
            if(++i == priorities.length) i = 0;
        }
        
        return priorities[location] - 10;
    }
}