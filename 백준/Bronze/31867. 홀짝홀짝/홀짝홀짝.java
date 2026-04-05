import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int odd = 0;
        int even = 0;
        
        for(int i =0; i< N; i++){
            int num = str.charAt(i);
            if( num % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        
        if(even > odd){
            System.out.print("0");
        }else if(even < odd){
            System.out.print("1");
        }else{
            System.out.print("-1");
        }
        
    }
}