import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[][] student = new int[7][2];
        
        for(int i = 0; i < N ; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            
            int gen = Integer.parseInt(str.nextToken());
            int age = Integer.parseInt(str.nextToken());
            
            student[age][gen]++;
        }
        
        int room = 0;
        
        for(int i = 1; i < student.length; i++){
            for(int j = 0; j < student[i].length; j++){
                if(student[i][j] == 0){
                    continue;
                }else if (student[i][j] <= K){
                    room++;
                } else if (student[i][j] % K != 0){
                    room += student[i][j] / K + 1;
                } else{
                    room += student[i][j] / K;
                }
            }
        }
        
        System.out.print(room);
    }
}