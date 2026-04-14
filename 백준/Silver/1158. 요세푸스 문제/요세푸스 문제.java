import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int seat = 0;
        
        List<Integer> pick = new ArrayList<>();
        List<Integer> table = new LinkedList<>();
        for(int i = 0; i<N; i++){
            table.add(i+1);
        }
        int cursor = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < K; j++){
                cursor++;
                
                if(cursor > table.size()){
                    cursor = 1;
                }
            }
            pick.add(table.remove(cursor-1));
            cursor -= 1;
        } 
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i =0; i<pick.size();i++){
            sb.append(pick.get(i));
            if(i < pick.size()-1){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.print(sb);
        
    }
}
