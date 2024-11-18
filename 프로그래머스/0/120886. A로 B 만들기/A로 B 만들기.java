class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        for (String str : after.split("")) {
            before = before.replaceFirst(str, "");
        }
        
        answer = before.equals("") ? 1 : 0;
        
        return answer;
    }
}