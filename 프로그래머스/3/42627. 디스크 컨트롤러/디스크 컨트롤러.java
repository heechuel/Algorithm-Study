import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        
        int total = 0;
        int time = 0;
        int index = 0;
        int n = jobs.length;
        
        while(index < n || !pq.isEmpty()){
            while(index < n && jobs[index][0] <= time){
                pq.offer(jobs[index++]);
            }
            
            if(pq.isEmpty()){
                time = jobs[index][0];
            }else{
                int[] cur = pq.poll();
                time += cur[1];
                total += time - cur[0];
            }
            
        }
        
        return (int) (total / n);
        
    }
}