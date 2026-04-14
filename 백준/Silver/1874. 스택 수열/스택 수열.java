import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> stackNum = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        int num = 0;
        for(int i = 0; i< n; i++){
            int inputNum = Integer.parseInt(br.readLine());
            int save = 0;
            
            while(num < inputNum){
                stackNum.push(++num);
                sb.append("+\n");
            }
            
            if(stackNum.isEmpty() || stackNum.peek() != inputNum){
                System.out.print("NO");
                return;
            }
            
            stackNum.pop();
            sb.append("-\n");
        }
        
        System.out.print(sb);
    }
}
