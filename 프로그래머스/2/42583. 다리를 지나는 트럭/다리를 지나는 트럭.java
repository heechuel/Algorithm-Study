import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<int[]> deque = new ArrayDeque<>();
        int bridge_weight = 0;
        int time_count = 0;
        int truck_count = 0;
        
        while(truck_count < truck_weights.length ){
            time_count++;
            
            while(!deque.isEmpty() && deque.peek()[1] == time_count){
                bridge_weight -= deque.peek()[0];
                deque.poll();
            }
            
            if(deque.isEmpty() || bridge_weight + truck_weights[truck_count] <= weight ){
                int[] truck = new int[]{truck_weights[truck_count], time_count + bridge_length};
                deque.offer(truck);
                bridge_weight += truck_weights[truck_count];
                truck_count++;
            }
            
        }
        
        return deque.pollLast()[1];
    }
}
