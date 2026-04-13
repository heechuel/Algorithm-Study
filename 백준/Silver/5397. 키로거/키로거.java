import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i< num; i++){
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();
            String st = br.readLine();
            
            for(char c : st.toCharArray()){
                if(c == '<'){
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                }else if (c == '>'){
                    if(!right.isEmpty()){
                        left.push(right.pop());
                    }
                } else if (c == '-'){
                    if(!left.isEmpty()){
                        left.pop();
                    }
                }else{
                    left.push(c);
                }
            }
            
            while (!left.isEmpty()) right.push(left.pop());
            while (!right.isEmpty()) {
                result.append(right.pop());
            }
            result.append("\n");
        }
        System.out.print(result);
    }
}