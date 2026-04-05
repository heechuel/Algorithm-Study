import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long A = Long.parseLong( st.nextToken() );
        long B = Long.parseLong( st.nextToken() );
        
        if( A > B){
            long temp = A;
            A = B;
            B = temp;
        }
        
        if(B - A == 0){
            System.out.println("0");
            return;
        }else{
            System.out.println(B - A - 1);
        
        }
        
        for(long i = A + 1; i < B; i++){
            System.out.print(i + " ");
        }
    }
}