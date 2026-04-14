import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i< N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            
            switch(order){
                case "push":
                    int X = Integer.parseInt(st.nextToken());
                    stack.push(X);
                    break;
                case "pop":
                    sb.append( stack.isEmpty() ? -1 : stack.pop() ).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0 ).append("\n");
                    break;
                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.peek() ).append("\n");
                    break;
            }
        }
        
        System.out.print(sb);
    }
}