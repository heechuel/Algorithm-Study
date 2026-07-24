import java.util.*;
class Solution {
    Set<Integer> hashSet = new HashSet<>();
    boolean[] visited = new boolean[7];
    
    public int solution(String numbers) {
        int answer = 0;
        
        dfs(numbers, "", 0);
        
        for(Integer num : hashSet){
            if(isPrime(num)) answer++;
        }
        return answer;
    }
    
    public void dfs(String numbers , String s, int depth){
        if(depth > numbers.length()){
            return;
        }
        
        for(int i = 0; i< numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                hashSet.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers, s + numbers.charAt(i), depth+1);
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime(int num){
        if(num == 0 || num == 1) return false;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}