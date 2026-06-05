import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> MaxScoville = new PriorityQueue<>();
        int mixed = 0;
        
        for(int i = 0; i<scoville.length; i++){
            MaxScoville.offer(scoville[i]);
        }
        
        while(!MaxScoville.isEmpty() && MaxScoville.peek() < K){
            int Scoville1 = MaxScoville.poll(); 
            
            if(!MaxScoville.isEmpty()){
                MaxScoville.offer(Scoville1 + (MaxScoville.poll() * 2) );
            }else{
                return -1;
            }
            mixed++;
        }
        
        if(MaxScoville.isEmpty()){
            mixed = -1;
        }
        
        return mixed;
        
    }
}