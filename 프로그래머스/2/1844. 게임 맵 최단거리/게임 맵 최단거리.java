import java.util.*;

class Solution {
    static final int[] di = {-1,0,1,0};
    static final int[] dj = {0,1,0,-1};
    static int n,m;
    static int[][] a;
    static boolean[][] visited;
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        a = new int[n][m];
        visited = new boolean[n][m];
        bfs(maps, 0,0);
        return visited[n-1][m-1] ? a[n-1][m-1] : -1;
    }
    
    static void bfs(int[][]maps ,int i, int j){
        Deque<int[]> deque = new ArrayDeque<>();
        visited[i][j] = true;
        deque.offer(new int[] {i,j});
        a[0][0] = 1;
        while(!deque.isEmpty()){
            int[] ij = deque.poll();
            i = ij[0];
            j = ij[1];
            for(int s = 0; s< 4; s++){
                int ni = i + di[s];
                int nj = j + dj[s];
                if(0<=ni&&ni<n && 0<=nj&&nj<m && !visited[ni][nj] && maps[ni][nj] != 0){
                    visited[ni][nj] = true;
                    a[ni][nj] = a[i][j] + 1;
                    deque.offer(new int[] {ni,nj});
                }
            }
        }
        
    }
    
}