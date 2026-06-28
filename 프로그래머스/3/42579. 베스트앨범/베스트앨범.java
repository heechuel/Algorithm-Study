import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, List<int[]>> map2 = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++){
            map1.put(genres[i], map1.getOrDefault(genres[i], 0) + plays[i]);
            map2.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[]{i, plays[i]});
        }
        
        ArrayList<String> songs = new ArrayList<>(map1.keySet());
        songs.sort((a, b) -> map1.get(b) - map1.get(a));
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(String s : songs){
            List<int[]> list = map2.get(s);
            list.sort((a,b) -> {
                if(a[1] != b[1]) return b[1] - a[1];
                return a[0] - b[0];
            });
            for(int i = 0; i< Math.min(2, list.size()); i++){
                answer.add(list.get(i)[0]);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
        
    }
}