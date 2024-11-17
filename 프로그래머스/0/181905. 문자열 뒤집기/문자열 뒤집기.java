class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String[] target = my_string.split("");
        int tryTime = (e - s) / 2;
        
        for (int i = 0; i <= tryTime; i++) {
            String temp = target[s + i];
            target[s + i] = target[e - i];
            target[e - i] = temp;
        }
        
        for (String str : target) {
            answer += str;
        }
        
        return answer;
    }
}