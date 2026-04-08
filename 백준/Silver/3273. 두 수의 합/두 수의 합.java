import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i< n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int X = Integer.parseInt(br.readLine());
        int sum = 0;
        
        Arrays.sort(arr);
        
        int a = 0;
        int b = n -1;
        
        outer:
        while(true){
            if(a >= b){
                break outer;
            }
            
            if(arr[a] + arr[b] == X){
                sum++;
                a++;
                b--;
            }else if(arr[a] + arr[b] > X){
                b--;
            }else if(arr[a] + arr[b] < X){
                a++;
            }
        }
        
        
        System.out.print(sum);
        
    }
}