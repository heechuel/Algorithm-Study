import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String bars = "DCBAE";
        String arr ="";
        int count = 0;
        
        for(int i =0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            count = 0;
            for(int j = 0; j<4; j++){
                count += Integer.parseInt(st.nextToken());
            }
            arr = arr+bars.charAt(count)+"\n";
        }
        
        System.out.print(arr);
    }
}