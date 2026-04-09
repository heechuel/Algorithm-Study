import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int[] sum = new int[T];
        for(int i = 0; i<T; i++){
            String st = br.readLine();
            String[] num = st.split(",");
            
            sum[i] = Integer.parseInt(num[0]) +Integer.parseInt(num[1]);
        }
        
        for(int i = 0; i<T; i++){
            System.out.println(sum[i]);
        }
    }
}