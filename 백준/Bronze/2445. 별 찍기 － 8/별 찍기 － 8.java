import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        //윗줄
        for(int i = 1; i < N + 1; i++){
            for(int j = 0; j < 2*N; j++){
                if( j > i-1 && j < 2*N-i){
                    bw.write(" ");
                }else{
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        
        //아랫줄
        for(int i = N-1; i > 0; i--){
            for(int j = 0; j < 2*N; j++){
                if( j > i-1 && j < 2*N-i){
                    bw.write(" ");
                }else{
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        
        
        bw.flush();
        bw.close();
    }
}