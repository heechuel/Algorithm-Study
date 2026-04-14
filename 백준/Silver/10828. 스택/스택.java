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
                    if(!stack.isEmpty()){
                        sb.append(stack.pop());
                        sb.append("\n");
                    }else{
                        sb.append(-1);
                        sb.append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size());
                    sb.append("\n");
                    break;
                case "empty":
                    if(stack.size() == 0){
                        sb.append(1);
                        sb.append("\n");
                    }else{
                        sb.append(0);
                        sb.append("\n");
                    }
                    break;
                case "top":
                    if(!stack.isEmpty()){
                        sb.append(stack.peek());
                        sb.append("\n");
                    }else{
                        sb.append(-1);
                        sb.append("\n");
                    }
                    break;
            }
        }
        
        System.out.print(sb);
    }
}