import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        // 두 힙 방식 대신 TreeMap 사용 — 중복 값을 value(개수)로 관리
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (String op : operations) {
            StringTokenizer st = new StringTokenizer(op);
            String cmd = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (cmd.equals("I")) {
                // 삽입: 이미 있으면 개수 +1, 없으면 1
                map.put(num, map.getOrDefault(num, 0) + 1);

            } else if (cmd.equals("D") && !map.isEmpty()) {
                // D 1 → 최댓값 제거 / D -1 → 최솟값 제거
                int target = (num == 1) ? map.lastKey() : map.firstKey();

                if (map.get(target) == 1) {
                    map.remove(target);         // 개수가 1이면 키 자체 제거
                } else {
                    map.put(target, map.get(target) - 1); // 개수만 -1
                }
            }
            // D인데 map이 비어 있으면 그냥 무시
        }

        if (map.isEmpty()) return new int[]{0, 0};
        return new int[]{map.lastKey(), map.firstKey()};
    }
}