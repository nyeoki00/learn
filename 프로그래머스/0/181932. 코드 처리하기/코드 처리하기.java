class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        char[] targets = code.toCharArray();
        
        for (int i = 0; i < targets.length; i++) {
            char target = targets[i];
            
            if (target == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            
            if (mode == 0 && i % 2 == 0) {
                answer += target;
            } else if (mode == 1 && i % 2 == 1) {
                answer += target;
            }
        }
        
        answer = answer.isEmpty() ? "EMPTY" : answer;
        
        return answer;
    }
}