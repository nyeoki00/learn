class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        int startIdx = -1;
        
        do {
            startIdx = myString.indexOf(pat, startIdx + 1);
            answer = startIdx != -1 ? answer + 1 : answer;
        } while (startIdx != -1);
        
        return answer;
    }
}