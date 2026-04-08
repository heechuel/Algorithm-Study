import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] room = new int[10];
        int roomNum = Integer.parseInt(br.readLine());
        int need = 0;
        
        while(roomNum>0){
            room[roomNum%10]++;
            roomNum /= 10;
        }
        
        for(int i = 0; i<10; i++){
            if(i == 6 || i == 9) continue;
            need = Math.max(need, room[i]);
        }
        
        need = Math.max(need,(room[6]+room[9]+1) / 2);
        System.out.print(need);
    }
}