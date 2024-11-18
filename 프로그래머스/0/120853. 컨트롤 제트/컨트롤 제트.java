class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] targets = s.split(" ");
        
        for (int i = 0; i < targets.length; i++) {
            if (targets[i].equals("Z")) {
                answer -= Integer.parseInt(targets[i - 1]);
            } else {
                answer += Integer.parseInt(targets[i]);
            }
        }
        
        return answer;
    }
}