import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<Q; i++){
            int a = Integer.parseInt(br.readLine());
            if((a&(-a))==a){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
        
    }
}