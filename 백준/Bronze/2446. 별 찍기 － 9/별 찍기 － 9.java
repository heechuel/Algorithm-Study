import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 2 * N - 1 - i; j++){
                if(j >= i){
                    sb.append('*');
                }else{
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }
        
        
        for(int i = N; i < 2 * N - 1; i++){
            for(int j = 0; j < i+1; j++){
                if( j < 2 * N - i - 2){
                    sb.append(' ');
                }else{
                    sb.append('*');
                }
            }
            sb.append('\n');
        }
        
        System.out.print(sb);
    }
}
