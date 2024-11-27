class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        boolean result = false;
        
        if (ineq.equals("<")) {
            result = eq.equals("=") ? n <= m : n < m;
        } else {
            result = eq.equals("=") ? n >= m : n > m;
        }
        
        answer = result ? 1 : 0;
        
        return answer;
    }
}