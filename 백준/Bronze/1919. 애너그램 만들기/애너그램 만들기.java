import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word1 = br.readLine();
        String word2 = br.readLine();
        
        int[] count = new int[26];

        for(int i = 0; i<word1.length(); i++){
            count[word1.charAt(i) - 'a'] += 1;
        }
        
        for(int i =0; i<word2.length(); i++){
            count[word2.charAt(i) - 'a'] -= 1;
        }
        
        
        int sum = 0;
        for(int i = 0; i< 26; i++){
            if(count[i] != 0 && count[i] > 0){
                sum += count[i];
            }else if(count[i] != 0 && count[i] < 0){
                sum -= count[i];
            }
        }
        
        System.out.println(sum);
    }
}