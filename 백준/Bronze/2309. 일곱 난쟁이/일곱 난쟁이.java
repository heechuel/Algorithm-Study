import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] shorter = new int[9];
        int sum = 0;
        
        for(int i = 0; i<9; i++){
            shorter[i] = Integer.parseInt(br.readLine());
            sum += shorter[i];
        }
    
        Arrays.sort(shorter);
        
        outer:
        for(int i = 0; i < shorter.length; i++){
            for(int j = i+1; j < shorter.length; j++){
                if( sum - shorter[i] - shorter[j] == 100){
                    
                    for(int k = 0; k < 9; k++){
                        if( k != i && k != j){
                            System.out.println(shorter[k]);
                        }
                    }
                    break outer;           
                }
            }
        }
    }
}

