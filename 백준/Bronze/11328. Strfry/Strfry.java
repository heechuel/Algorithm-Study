import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[N];
        
        for(int i = 0; i< N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word1 = st.nextToken();
            String word2 = st.nextToken();
            
            String[] Sword1 = word1.split("");
            String[] Sword2 = word2.split("");
            
            Arrays.sort(Sword1);
            Arrays.sort(Sword2);
            
            
            
            for(int j = 0; j<Math.min(Sword1.length,Sword2.length); j++){
                if(Sword1[j].equals(Sword2[j])){
                }else{
                    count[i] = 1;
                }
            }
        }
        
        
        for(int i = 0; i<N; i++){
            if(count[i] == 1){
                System.out.println("Impossible");
            }else{
                System.out.println("Possible");
            }
        }
    }
}