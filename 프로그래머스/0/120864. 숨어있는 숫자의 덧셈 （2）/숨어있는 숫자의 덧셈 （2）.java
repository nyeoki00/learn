class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] target = my_string.split("[A-Za-z]");
        
        for (String s : target) {
            if (!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}