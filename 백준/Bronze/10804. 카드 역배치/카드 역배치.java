import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[21];
        
        for(int i = 1; i<21; i++){
            arr[i] = i;
        }
        
        for(int j = 0; j<10; j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            while(a < b && a != b){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            } 
        }
        
        for(int k = 1; k<21; k++){
            System.out.print(arr[k] +" ");
        }
    }
}