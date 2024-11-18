class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] targets = my_string.split(" ");
        
        answer += Integer.parseInt(targets[0]);
        
        for (int i = 1; i < targets.length; i++) {
            String target = targets[i];
            
            if (targets[i].equals("+") || targets[i].equals("-")) {
                int num = Integer.parseInt(targets[i + 1]);
                
                answer = targets[i].equals("+") ? answer + num : answer - num;
            }
            
        }
        
        return answer;
    }
}