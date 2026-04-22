import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        Deque<int[]> stack = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i<=n; i++){
            int height = Integer.parseInt(st.nextToken());
            
            while(!stack.isEmpty() && stack.peek()[1] < height){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                sb.append("0 ");
            }else{
                sb.append(stack.peek()[0]).append(" ");
            }
            
            stack.push(new int[]{i,height});
            
        }
        
        System.out.print(sb);
        
    }
}
