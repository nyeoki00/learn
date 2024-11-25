class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";

        String[] targets = code.split("");
        
        for (int i = 0; i < targets.length; i++) {
            if (i % q == r) {
                answer += targets[i];
            }
        }
        
        return answer;
    }
}