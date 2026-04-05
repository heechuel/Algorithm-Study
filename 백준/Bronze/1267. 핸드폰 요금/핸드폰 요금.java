import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int Y = 0;
        int M = 0;
        
        for(int i = 0; i < N; i++){
            int time = Integer.parseInt(st.nextToken());
            
            Y += (time / 30) * 10 + 10;
            M += (time / 60) * 15 + 15;
        }
        
        if(Y == M){
            System.out.println("Y M " + Y);
        }else if(Y > M){
            System.out.println("M " + M);
        }else{
            System.out.println("Y " + Y);
        }
        
    }
}