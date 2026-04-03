import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = 100;
        
        for(int i = 0; i<7; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            
            if(num % 2 != 0 && num < min){
                sum += num;
                min = num;
            }else if(num % 2 != 0){
                sum += num;
            }
        }
        
        if(sum != 0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println("-1");
        }
        
    }
}