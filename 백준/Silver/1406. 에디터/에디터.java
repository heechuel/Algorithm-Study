import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N1 = br.readLine();
        StringBuffer N = new StringBuffer(N1);
        
        
        int M = Integer.parseInt(br.readLine());
        int cusor = N1.length();
        
        while( M > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch(command){
                case "L":
                    if(cusor != 0){
                        cusor--;
                    }
                    M--;
                    break;
                case "D":
                    if(cusor < N.length()){
                        cusor++;
                    }
                    M--;
                    break;
                case "B":
                    if(cusor != 0){
                        N.deleteCharAt(cusor-1);
                        cusor--;
                    }
                    M--;
                    break;
                case "P":
                    String word = st.nextToken();
                    N.insert(cusor,word);
                    cusor++;
                    M--;
                    break;
            }
        }
        
        System.out.print(N);
    }
}