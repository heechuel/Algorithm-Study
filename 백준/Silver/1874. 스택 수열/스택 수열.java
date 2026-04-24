import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> stack = new ArrayDeque<>();
        int c = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            
            while (c < num){
                stack.push(++c);
                sb.append("+").append("\n");
            }
            
            if(stack.peek() != num){
                System.out.print("NO");
                return;
            }
            
            sb.append("-").append("\n");
            stack.pop();
            
        }
        
        System.out.print(sb);
    }
}