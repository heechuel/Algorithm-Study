import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int [] word = new int[26];
        
        
        for(int i = 0; i<S.length(); i++){
            int num = (int)S.charAt(i);
            word[num-97]++;
        }
        
        for(int i = 0; i<word.length;i++){
            System.out.print(word[i] + " ");
        }
    }
}