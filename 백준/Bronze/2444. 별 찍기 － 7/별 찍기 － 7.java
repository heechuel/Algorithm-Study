import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        
        for(int i = 0; i < N-1; i++){
            for(int j = 0; j < N+i; j++){
                if( j <= N-i-2){
                    bw.write(" ");
                }else{
                    bw.write("*");
                }
            }    
            bw.write("\n");
        }
        
        
        for(int i=0; i < N; i++){
            int max = 2*N - (2*(i+1) - 1);
            for(int j =0; j < max+i; j++){
                if( i <= j){
                    bw.write("*");
                }else{
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        
        
        bw.flush();
        bw.close();
    }
}