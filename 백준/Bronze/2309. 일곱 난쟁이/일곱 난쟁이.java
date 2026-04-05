import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] shorter = new int[9];
        int sum = 0;
        int overheight = 0;
        int fake1, fake2;
        
        for(int i = 0; i<9; i++){
            shorter[i] = Integer.parseInt(br.readLine());
            sum += shorter[i];
        }
        
        
        for(int i = 0; i < shorter.length; i++){
            for(int j = i+1; j < shorter.length; j++){
                if( sum - shorter[i] - shorter[j] == 100){
                    shorter[i] = 101;
                    shorter[j] = 101;
                    i = shorter.length;
                    j = shorter.length;
                }
            }
        }
        
        Arrays.sort(shorter);
        
        
        
        for(int k = 0; k < 7; k++){
            System.out.println(shorter[k]);
        }
    }
}

