class Solution {
    public int solution(int n) {
        int answer = 0;
        int cal = 1;
        
        for (int i = 1; i <= 10; i++) {
            cal *= i;
            if (cal >= n) {
                answer = cal == n ? i : i - 1;
                break;
            }
        }
        
        return answer;
    }
}