import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] password = new String[num];
        
        
        for(int i = 0; i<num; i++){
            String st = br.readLine();
            List<Character> p1 = new LinkedList<>();
            int cursor = 0;
            
            for(char c : st.toCharArray()){
                if(c == '<'){
                    if(cursor != 0){
                        cursor--;
                    }
                }else if (c == '>'){
                    if(cursor != p1.size()){
                        cursor++;
                    }
                } else if (c == '-'){
                    if(cursor != 0){
                        p1.remove(cursor-1);
                        cursor--;
                    }
                } else{
                    p1.add(cursor, c);
                    cursor++;
                }
            }
            
            StringBuilder sb = new StringBuilder();
            for(char c : p1){
                sb.append(c);
            }
            password[i] = sb.toString();
            
        }
        
        
        for(int i = 0; i<num ; i++){
            System.out.println(password[i]);
        }
        
    }
}