import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        float sing = (float)n / 2;
        
        sing /= 2;
        
        System.out.printf("%.2f", sing);
        
    }
}