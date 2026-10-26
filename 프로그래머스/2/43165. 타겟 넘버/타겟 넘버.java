class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    void dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            // TODO: sum이 target과 같으면 answer 증가
            if(sum == target) answer++;
            return;
        }
        // TODO: 더하는 갈래로 내려가기
        dfs(numbers, target, depth+1, sum+numbers[depth]);
        // TODO: 빼는 갈래로 내려가기
        dfs(numbers, target, depth+1, sum-numbers[depth]);
    }
}