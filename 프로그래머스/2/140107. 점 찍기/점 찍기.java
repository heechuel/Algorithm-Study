class Solution {
    public long solution(int k, int d) {
        long result = 0;
        
        for(int i = 0; i<=d; i+=k){
            int yDistance = yPosition(i, d);
            result += yCount(yDistance, k);
        }
        return result;
    }
    
    private static int yPosition(int x, int d){
        long xx = (long)Math.pow(x,2);
        long dd = (long)Math.pow(d,2);
        
        int y = (int)Math.sqrt(dd-xx);
        return y;
    }
    
    private static int yCount(int y, int k){
        int count  = (y / k);
        return count+1;
    }
}
