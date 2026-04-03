import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());
        
        if(one == two && two == three){
            System.out.print(one * 1000 + 10000);
        }else if(one == two || one == three){
            System.out.print(one * 100 + 1000);
        }else if( two == three){
            System.out.print(two * 100 + 1000);
        }else{
            System.out.print(Math.max(one*100, Math.max(two*100, three*100)));
        }
        
        
    }
}