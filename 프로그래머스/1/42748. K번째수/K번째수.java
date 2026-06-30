import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int len = commands[i][1] - commands[i][0] + 1;
            int[] arr = new int[len];
            
            if(len == 1){
                result[i] = array[commands[i][0] - 1];
                continue;
            }
            
            for(int j = commands[i][0] - 1, k = 0; j < commands[i][1]; j++, k++){
                arr[k] = array[j];
            }
            
            Arrays.sort(arr);
            result[i] = arr[commands[i][2] - 1];
        }
        
        return result;
    }
}