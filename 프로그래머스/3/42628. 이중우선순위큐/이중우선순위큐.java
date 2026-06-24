import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(String op : operations){
            StringTokenizer st = new StringTokenizer(op);
            String order = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            
            if(order.equals("I")){
                map.put(num, map.getOrDefault(num,0) + 1);
            }else if(order.equals("D") && !map.isEmpty()){
                int target = (num == -1) ? map.firstKey() : map.lastKey();
                
                if(map.get(target) == 1){
                    map.remove(target);
                }else{
                    map.put(target, map.get(target) - 1);
                }
            }
        }
        
        if(!map.isEmpty()){
            return new int[]{map.lastKey(), map.firstKey()};
        }else{
            return new int[]{0,0};
        }
        
    }
}
