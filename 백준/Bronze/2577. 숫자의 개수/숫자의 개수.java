import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        long calc = A*B*C;
        int[] num = new int[10];
        
        
        String str = Long.toString(calc);
        String[] arr = str.split("");
        
        
        for(int i = 0; i<str.length(); i++){
            num[Integer.parseInt(arr[i])]++;
        }
        
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        
    }
}